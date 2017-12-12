
Build React JavaScript app with shadow-cljs
----

> Although shadow-cljs is not designed for js, but it bundles js project if its js dependencies support is good.
> It's `102k(lib.js)` and `85k(main.js)` after optimization with Closure Compiler.

### Usage

Dev:

```bash
yarn
yarn watch # compile code, also watching

yarn index # copies index.html to target/
# open http://localhost:8080
```

Release:

```bash
yarn
yarn release
yarn index-dist # copies index.html to dist/
yarn serve
# open http://localhost:8080
```

### How it works?

`shadow-cljs` loads `main.cljs`, which requires code from local files with `["./main" :as app]`

```bash
=>> tree src/
src/
├── container.js
├── main.cljs
└── main.js

0 directories, 3 files
```

Notice that shadow-cljs server only watchs ClojureScript code, editing JavaScript does not trigger reloading.
Also import syntax is slightly different(might be bugs?).

### External Reading

https://clojureverse.org/t/experimenting-bundling-javascript-projects-with-shadow-cljs/1178/3

### License

MIT
