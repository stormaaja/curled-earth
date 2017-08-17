(defproject curled-earth-backend "0.1.0-SNAPSHOT"
  :description "cURLed Earth is Scorched Earth inspired tank mmo game which is played with cURL."
  :url "https://github.com/stormaaja/curled-earth"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.6.0"]
                 [ring/ring-defaults "0.3.1"]
                 [ring "1.6.2"]
                 [ring.middleware.logger "0.5.0"]
                 [http-kit "2.2.0"]
                 [org.clojure/data.json "0.2.6"]]
  :main ^:skip-aot curled-earth-backend.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
