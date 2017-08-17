(defproject curled-earth-backend "0.1.0-SNAPSHOT"
  :description "cURLed Earth is Scorched Earth inspired tank mmo game which is played with cURL."
  :url "https://github.com/stormaaja/curled-earth"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot curled-earth-backend.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
