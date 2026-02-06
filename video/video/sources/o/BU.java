package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.RP1;

/* loaded from: classes.dex */
public final class BU<T> {
    public static final a a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {

        @FV(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.BU$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0160a extends AbstractC4225Si2 implements VA0<NP0<T>, HM<? super C7458kA2>, Object> {
            public int Z0;
            public /* synthetic */ Object a1;
            public final /* synthetic */ List<AU<T>> b1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0160a(List<? extends AU<T>> list, HM<? super C0160a> hm) {
                super(2, hm);
                this.b1 = list;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                Object l = C7289jT0.l();
                int i = this.Z0;
                if (i != 0) {
                    if (i == 1) {
                        RT1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    a aVar = BU.a;
                    List<AU<T>> list = this.b1;
                    this.Z0 = 1;
                    if (aVar.c(list, (NP0) this.a1, this) == l) {
                        return l;
                    }
                }
                return C7458kA2.a;
            }

            @Override // o.VA0
            /* renamed from: U */
            public final Object i(NP0<T> np0, HM<? super C7458kA2> hm) {
                return ((C0160a) t(np0, hm)).F(C7458kA2.a);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                C0160a c0160a = new C0160a(this.b1, hm);
                c0160a.a1 = obj;
                return c0160a;
            }
        }

        @FV(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", i = {0, 1}, l = {42, 57}, m = "runMigrations", n = {"cleanUps", "cleanUpFailure"}, s = {"L$0", "L$0"})
        /* loaded from: classes.dex */
        public static final class b<T> extends KM {
            public Object Y0;
            public Object Z0;
            public /* synthetic */ Object a1;
            public int c1;

            public b(HM<? super b> hm) {
                super(hm);
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.a1 = obj;
                this.c1 |= Integer.MIN_VALUE;
                return a.this.c(null, null, this);
            }
        }

        @FV(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", i = {0, 0}, l = {44, 46}, m = "invokeSuspend", n = {"migration", "data"}, s = {"L$2", "L$3"})
        /* loaded from: classes.dex */
        public static final class c extends AbstractC4225Si2 implements VA0<T, HM<? super T>, Object> {
            public Object Z0;
            public Object a1;
            public Object b1;
            public int c1;
            public /* synthetic */ Object d1;
            public final /* synthetic */ List<AU<T>> e1;
            public final /* synthetic */ List<HA0<HM<? super C7458kA2>, Object>> f1;

            @FV(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: o.BU$a$c$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0161a extends AbstractC4225Si2 implements HA0<HM<? super C7458kA2>, Object> {
                public int Z0;
                public final /* synthetic */ AU<T> a1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0161a(AU<T> au, HM<? super C0161a> hm) {
                    super(1, hm);
                    this.a1 = au;
                }

                @Override // o.AbstractC5644cl
                public final Object F(Object obj) {
                    Object l = C7289jT0.l();
                    int i = this.Z0;
                    if (i != 0) {
                        if (i == 1) {
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        AU<T> au = this.a1;
                        this.Z0 = 1;
                        if (au.b(this) == l) {
                            return l;
                        }
                    }
                    return C7458kA2.a;
                }

                @Override // o.HA0
                /* renamed from: U */
                public final Object invoke(HM<? super C7458kA2> hm) {
                    return ((C0161a) u(hm)).F(C7458kA2.a);
                }

                @Override // o.AbstractC5644cl
                public final HM<C7458kA2> u(HM<?> hm) {
                    return new C0161a(this.a1, hm);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(List<? extends AU<T>> list, List<HA0<HM<? super C7458kA2>, Object>> list2, HM<? super c> hm) {
                super(2, hm);
                this.e1 = list;
                this.f1 = list2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
                if (r10 == r0) goto L17;
             */
            /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x008e A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008a -> B:11:0x0046). Please submit an issue!!! */
            @Override // o.AbstractC5644cl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object F(Object obj) {
                List<HA0<HM<? super C7458kA2>, Object>> list;
                Iterator<T> it;
                AU au;
                Iterator<T> it2;
                Object obj2;
                Object l = C7289jT0.l();
                int i = this.c1;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            it = (Iterator) this.Z0;
                            list = (List) this.d1;
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        obj2 = this.b1;
                        it2 = (Iterator) this.Z0;
                        List<HA0<HM<? super C7458kA2>, Object>> list2 = (List) this.d1;
                        RT1.n(obj);
                        au = (AU) this.a1;
                        list = list2;
                        if (!((Boolean) obj).booleanValue()) {
                            list.add(new C0161a(au, null));
                            this.d1 = list;
                            this.Z0 = it2;
                            this.a1 = null;
                            this.b1 = null;
                            this.c1 = 2;
                            obj = au.c(obj2, this);
                        } else {
                            obj = obj2;
                        }
                        it = it2;
                    }
                } else {
                    RT1.n(obj);
                    obj = this.d1;
                    list = this.f1;
                    it = this.e1.iterator();
                }
                if (!it.hasNext()) {
                    AU au2 = (AU) it.next();
                    this.d1 = list;
                    this.Z0 = it;
                    this.a1 = au2;
                    this.b1 = obj;
                    this.c1 = 1;
                    Object a = au2.a(obj, this);
                    if (a != l) {
                        Iterator<T> it3 = it;
                        obj2 = obj;
                        obj = a;
                        au = au2;
                        it2 = it3;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        it = it2;
                        if (!it.hasNext()) {
                            return obj;
                        }
                    }
                    return l;
                }
            }

            @Override // o.VA0
            /* renamed from: U */
            public final Object i(T t, HM<? super T> hm) {
                return ((c) t(t, hm)).F(C7458kA2.a);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                c cVar = new c(this.e1, this.f1, hm);
                cVar.d1 = obj;
                return cVar;
            }
        }

        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public final <T> VA0<NP0<T>, HM<? super C7458kA2>, Object> b(List<? extends AU<T>> list) {
            C6562gT0.p(list, "migrations");
            return new C0160a(list, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Throwable, T] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0088 -> B:25:0x006b). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008b -> B:25:0x006b). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final <T> Object c(List<? extends AU<T>> list, NP0<T> np0, HM<? super C7458kA2> hm) {
            b bVar;
            int i;
            List list2;
            RP1.h hVar;
            Iterator<T> it;
            Throwable th;
            if (hm instanceof b) {
                bVar = (b) hm;
                int i2 = bVar.c1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.c1 = i2 - Integer.MIN_VALUE;
                    Object obj = bVar.a1;
                    Object l = C7289jT0.l();
                    i = bVar.c1;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                it = (Iterator) bVar.Z0;
                                hVar = (RP1.h) bVar.Y0;
                                try {
                                    RT1.n(obj);
                                } catch (Throwable r9) {
                                    r9 = (T) th;
                                    T t = hVar.X;
                                    if (t == null) {
                                        hVar.X = r9;
                                    } else {
                                        C6562gT0.m(t);
                                        C3917Pf0.a((Throwable) hVar.X, r9);
                                    }
                                }
                                while (it.hasNext()) {
                                    HA0 ha0 = (HA0) it.next();
                                    bVar.Y0 = hVar;
                                    bVar.Z0 = it;
                                    bVar.c1 = 2;
                                    if (ha0.invoke(bVar) == l) {
                                        return l;
                                    }
                                }
                                th = (Throwable) hVar.X;
                                if (th == null) {
                                    return C7458kA2.a;
                                }
                                throw th;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list2 = (List) bVar.Y0;
                        RT1.n(obj);
                    } else {
                        RT1.n(obj);
                        ArrayList arrayList = new ArrayList();
                        VA0<? super T, ? super HM<? super T>, ? extends Object> cVar = new c(list, arrayList, null);
                        bVar.Y0 = arrayList;
                        bVar.c1 = 1;
                        if (np0.a(cVar, bVar) != l) {
                            list2 = arrayList;
                        } else {
                            return l;
                        }
                    }
                    hVar = new RP1.h();
                    it = list2.iterator();
                    while (it.hasNext()) {
                    }
                    th = (Throwable) hVar.X;
                    if (th == null) {
                    }
                }
            }
            bVar = new b(hm);
            Object obj2 = bVar.a1;
            Object l2 = C7289jT0.l();
            i = bVar.c1;
            if (i == 0) {
            }
            hVar = new RP1.h();
            it = list2.iterator();
            while (it.hasNext()) {
            }
            th = (Throwable) hVar.X;
            if (th == null) {
            }
        }

        public a() {
        }
    }
}
