
(ns main
  (:require ["app" :as app]))

(defn main! []
  (app/main))

(defn reload! []
  (app/reload))

(set! js/window.onload main!)
