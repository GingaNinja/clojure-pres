(ns reveal.slides)

(def slide-1
  [:section
   [:h1 "Clojure"]
   [:h3 "Let's Get Some Clojure"]
   [:p "(and some puns)"]
   ])

(def clojure-closure
  [:section
   [:h2 "It's Clojure, not a closure"]
   [:pre
    
    [:code {:class "hljs"
            :data-trim true
            :data-noescape true
            }
"function makeFn() {
    let a = 42;
    return function() {
        console.log(a)
    }
}"]]
   [:pre
    [:code {:class "hljs"
            :data-trim nil
            :data-noescape true}
"(defn multiplesOf
  [multiple target]
  (let [multiplecount (- (Math/ceil (/ target multiple)) 1)]
    (take multiplecount (iterate 
                          (partial + multiple) 
                          multiple))))"
  ]]])

(def what-clojure-rich
  [:section
   [:h2 "What is Clojure?"]
   [:p "Designed by Rich Hickey:"]
   [:img {:src "img/Rich_Hickey.jpg" :height "400"}]])

(def what-clojure-name
  [:section
   [:h2 "What is Clojure?"]
   [:p "Designed by Rich Hickey"
    [:blockquote "Clojure's name, according to Hickey, is a pun on the programming concept 'closure' incorporating the letters C, L, and J for C#, Lisp, and Java respectively—three languages which had a major influence on Clojure's design."]]])

(def lisp
  [:section
   [:h2 "What is a LISP anyway?"]])

(def lisp-list-processor
  [:section
   [:h2 "What is a LISP anyway?"]
   [:p "LISt Processor"]
   [:pre 
    [:code {:class "hljs"
            :data-trim nil}
     "(println \"hello there\")"]]
   [:blockquote "(What the world needs (I think) is not (a Lisp (with fewer parentheses)) but (an English (with more.)))"]])

(def lisp-homiconicity
  [:section
   [:h2 "What is a LISP anyway?"]
   [:p "Homoiconicity"]
   [:img {:src "img/Homer_Simpson_2006.png"}]])

(def run-on
  [:section
   [:h2 "What does Clojure run on?"]
   [:ul 
    [:li "JVM - Clojure"]
    [:li "Javascript - ClojureScript"]
    [:li ".Net CLR - Clojure CLR"]
    [:li "Bash? - Joker, Babashka"]]])

(def the-repl
  [:section
   [:h2 "The REPL"]
   [:p "Read-Eval-Print Loop"]])

(def why-useful
  [:section 
   [:h2 "Is it useful?"]
   [:ul
    [:li "Functional" [:blockquote "It is better to have 100 functions operate "  
                                             "on one data structure than to have 10 functions operate on "
                                             "10 data structures. - Alan J. Perlis"]]
    [:li "Learning new languages and paradigms"]
    [:li "Immutable - I know what my code is doing"]
    [:li "Uses the underlying platform"]
    [:li "The language itself is maleable"]]])

(def useful-tools
  [:section
   [:h2 "Useful tools for clojure development"]
   [:ul
    [:li "Leiningen / Boot"]
    [:li "Figwheel"]
    [:li "Emacs - uses a LISP"]
    [:li "VSCode + Calva"]
    [:li "deftest" [:pre
                    [:code {:class "hljs"
                            :data-trim true
                            :data-noescape true}
                     "(deftest addition-tests
  (is (= 5 (+ 3 2))))"]]]]])

(def useful-books-brave
  [:section
   [:h2 "Useful books"]
   [:p "Clojure for the Brave and True"]
   [:img {:src "img/brave-true.jpg"}]])

(def useful-books-joy
  [:section
   [:h2 "Useful books"]
   [:p "The Joy of Clojure"]
   [:img {:src "img/joyclojure.png" :height "400"}]])

(def useful-books-getting
  [:section
   [:h2 "Useful books"]
   [:p "Getting Clojure"]
   [:img {:src "img/roclojure.jpg" :height "400"}]])

(def questions
  [:section
   [:h1 [:pre [:code {:class "hljs" :data-trim true :data-noescape true} "(any? questions)"]]]])

(defn all
  "Add here all slides you want to see in your presentation."
  []
  [slide-1
   clojure-closure
   what-clojure-rich
   what-clojure-name
   lisp
   lisp-list-processor
   lisp-homiconicity
   run-on
   the-repl
   why-useful
   useful-tools
   useful-books-brave
   useful-books-joy
   useful-books-getting
   questions])
