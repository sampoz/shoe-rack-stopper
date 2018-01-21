(defproject shoe-rack-stopper "0.1.0-SNAPSHOT"
  :description "Shoe rack stopper made with scad-clj"
  :url "http://example.com/FIXME"
  :license {:name "GPLv3"
            :url "http://www.gnu.org/copyleft/gpl.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [scad-clj "0.5.2"]
                 [unicode-math "0.2.0"]]
  :main ^:skip-aot shoe-rack-stopper.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
