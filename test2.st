fun log (element data) {
    print data
}

main {
    set st = "test set"
    set e2 = "test set2"
    element e1 = "e1"
    element e3 = "2"
    st <- e1, e2, e3

    forEach(element el in st) {
        log(el)
    }
}


