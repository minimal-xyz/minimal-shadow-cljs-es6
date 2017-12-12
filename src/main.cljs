
(ns main
  (:require ["./main" :as app]))

(defn main! []
  (app/main))

(defn reload! []
  (app/reload))

(set! js/window.onload main!)
