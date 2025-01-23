function grandParent() {
  var gd = "xyz";
  return function parent() {
    var p = "y";
    return function child() {
      var c = "x";
      console.log(
        `My name is ${c} , my father's name is ${p} and my grandFather name is ${gd}`
      );
    };
    child();
  };
  parent();
}
