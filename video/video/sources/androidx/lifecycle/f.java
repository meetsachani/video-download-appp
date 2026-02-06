package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC9511sW0;
import o.JZ0;

/* loaded from: classes.dex */
public abstract class f {
    public AtomicReference<Object> a = new AtomicReference<>();

    /* loaded from: classes.dex */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;
        
        public static final C0029a Companion = new C0029a(null);

        /* renamed from: androidx.lifecycle.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0029a {

            /* renamed from: androidx.lifecycle.f$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public /* synthetic */ class C0030a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    a = iArr;
                }
            }

            public /* synthetic */ C0029a(C9516sY c9516sY) {
                this();
            }

            @InterfaceC9511sW0
            public final a a(b bVar) {
                C6562gT0.p(bVar, "state");
                int i = C0030a.a[bVar.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return a.ON_PAUSE;
                    }
                    return a.ON_STOP;
                }
                return a.ON_DESTROY;
            }

            @InterfaceC9511sW0
            public final a b(b bVar) {
                C6562gT0.p(bVar, "state");
                int i = C0030a.a[bVar.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 4) {
                            return null;
                        }
                        return a.ON_DESTROY;
                    }
                    return a.ON_PAUSE;
                }
                return a.ON_STOP;
            }

            @InterfaceC9511sW0
            public final a c(b bVar) {
                C6562gT0.p(bVar, "state");
                int i = C0030a.a[bVar.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 5) {
                            return null;
                        }
                        return a.ON_CREATE;
                    }
                    return a.ON_RESUME;
                }
                return a.ON_START;
            }

            @InterfaceC9511sW0
            public final a d(b bVar) {
                C6562gT0.p(bVar, "state");
                int i = C0030a.a[bVar.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return a.ON_RESUME;
                    }
                    return a.ON_START;
                }
                return a.ON_CREATE;
            }

            public C0029a() {
            }
        }

        /* loaded from: classes.dex */
        public /* synthetic */ class b {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                a = iArr;
            }
        }

        @InterfaceC9511sW0
        public static final a g(b bVar) {
            return Companion.a(bVar);
        }

        @InterfaceC9511sW0
        public static final a h(b bVar) {
            return Companion.b(bVar);
        }

        @InterfaceC9511sW0
        public static final a j(b bVar) {
            return Companion.c(bVar);
        }

        @InterfaceC9511sW0
        public static final a l(b bVar) {
            return Companion.d(bVar);
        }

        public final b i() {
            switch (b.a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean g(b bVar) {
            C6562gT0.p(bVar, "state");
            if (compareTo(bVar) >= 0) {
                return true;
            }
            return false;
        }
    }

    public abstract void a(JZ0 jz0);

    public abstract b b();

    public final AtomicReference<Object> c() {
        return this.a;
    }

    public abstract void d(JZ0 jz0);

    public final void e(AtomicReference<Object> atomicReference) {
        C6562gT0.p(atomicReference, "<set-?>");
        this.a = atomicReference;
    }
}
