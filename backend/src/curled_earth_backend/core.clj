(ns curled-earth-backend.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.logger :as logger]
            [ring.middleware.reload :as reload]
            [clojure.data.json :as json])
  (:use org.httpkit.server)
  (:gen-class))

(defroutes app-routes
  (route/resources "/")
  (GET "/hello" [] "World")
  (route/not-found "Not Found"))

(defn start-server
  []
  (println "Running server: http://localhost:8080")
  (org.apache.log4j.BasicConfigurator/configure)
  (run-server
   (logger/wrap-with-logger (reload/wrap-reload #'app-routes))
   {:port 8080}))

(defn -main
  [& args]
  (start-server))
