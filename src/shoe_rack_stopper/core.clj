(ns shoe-rack-stopper.core
  (:refer-clojure :exclude [use import])
  (:require [scad-clj.scad :refer :all]
            [scad-clj.model :refer :all]
            [unicode-math.core :refer :all])
  (:gen-class))

                                        ; In mm
(def radius 4)
(def height 21)

(defn -main
  "I am become stopper, the saviour of failing shoe racks"
  [& args]

  (def base
    (cylinder radius height))

  (def primitives
    base)

  (spit "shoe-rack-stopper.scad"
        (write-scad primitives)))
