document.querySelectorAll("input, textarea").forEach(el => {
  el.onpaste = null;
  el.oncopy = null;
  el.oncut = null;
  el.removeAttribute("onpaste");
  el.removeAttribute("oncopy");
  el.removeAttribute("oncut");
});
