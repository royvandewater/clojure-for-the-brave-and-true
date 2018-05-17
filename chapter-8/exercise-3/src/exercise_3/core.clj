(ns exercise-3.core)

(defmacro defattrs
  "Create accessors for keys under :attributes"
  ([name attr]
   `(def ~name (comp ~attr :attributes)))

  ([name attr & pairs]
   `(do
     (defattrs ~name ~attr)
     (defattrs ~@pairs))))
