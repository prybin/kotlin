package test

public trait ChangeProjectionKind1: Object {

    public trait Super: Object {
        public fun foo(p: MutableList<in String>)

        public fun dummy() // to avoid loading as SAM interface
    }

    public trait Sub: Super {
        override fun foo(p: MutableList<in String>)
    }
}
