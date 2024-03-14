def compile() {
    if (env.codetype == "maven") {
        print 'maven'
    }
    if (env.codetype == "nodejs") {
        print 'nodejs'
    }
    if (env.codetype == "python") {
        print 'python'
    }
    if (env.codetype == "static") {
        print 'static'
    }
}