main {
    set st = "test set"
    integer a = 3
    switch(a) {
    case 3: 
    print a
    case 2:
    print 2
    default:
	}
    element e1 = "test e1"
    element e2 = "test e2"
    element e3 = "2"
    element e4 = e3
    st <- e1, e2, e3, e4

    if (st <?> e1){
        print "set st contains e1"
    }
}

