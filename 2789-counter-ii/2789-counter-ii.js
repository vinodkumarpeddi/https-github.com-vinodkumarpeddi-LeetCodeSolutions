/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let present=init;
   return{
    increment(){
        return ++present;
    },
     decrement(){
        return --present;
    },
     reset(){
        return (present=init);
    }
   }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */