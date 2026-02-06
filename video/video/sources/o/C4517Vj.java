package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n37#2,2:122\n13346#3,2:124\n1863#4,2:126\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitKt\n*L\n36#1:122,2\n47#1:124,2\n58#1:126,2\n*E\n"})
/* renamed from: o.Vj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4517Vj {

    @FV(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {0}, l = {47}, m = "joinAll", n = {"$this$forEach$iv"}, s = {"L$0"})
    /* renamed from: o.Vj$a */
    /* loaded from: classes3.dex */
    public static final class a extends KM {
        public Object Y0;
        public int Z0;
        public int a1;
        public /* synthetic */ Object b1;
        public int c1;

        public a(HM<? super a> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.b1 = obj;
            this.c1 |= Integer.MIN_VALUE;
            return C4517Vj.d(null, this);
        }
    }

    @FV(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {58}, m = "joinAll", n = {}, s = {})
    /* renamed from: o.Vj$b */
    /* loaded from: classes3.dex */
    public static final class b extends KM {
        public Object Y0;
        public /* synthetic */ Object Z0;
        public int a1;

        public b(HM<? super b> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.Z0 = obj;
            this.a1 |= Integer.MIN_VALUE;
            return C4517Vj.c(null, this);
        }
    }

    @Nullable
    public static final <T> Object a(@NotNull Collection<? extends J10<? extends T>> collection, @NotNull HM<? super List<? extends T>> hm) {
        if (collection.isEmpty()) {
            return C8222nF.H();
        }
        return new C4420Uj((J10[]) collection.toArray(new J10[0])).c(hm);
    }

    @Nullable
    public static final <T> Object b(@NotNull J10<? extends T>[] j10Arr, @NotNull HM<? super List<? extends T>> hm) {
        if (j10Arr.length == 0) {
            return C8222nF.H();
        }
        return new C4420Uj(j10Arr).c(hm);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(@NotNull Collection<? extends RU0> collection, @NotNull HM<? super C7458kA2> hm) {
        b bVar;
        int i;
        Iterator it;
        if (hm instanceof b) {
            bVar = (b) hm;
            int i2 = bVar.a1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.a1 = i2 - Integer.MIN_VALUE;
                Object obj = bVar.Z0;
                Object l = C7289jT0.l();
                i = bVar.a1;
                if (i == 0) {
                    if (i == 1) {
                        it = (Iterator) bVar.Y0;
                        RT1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    it = collection.iterator();
                }
                while (it.hasNext()) {
                    bVar.Y0 = it;
                    bVar.a1 = 1;
                    if (((RU0) it.next()).T(bVar) == l) {
                        return l;
                    }
                }
                return C7458kA2.a;
            }
        }
        bVar = new b(hm);
        Object obj2 = bVar.Z0;
        Object l2 = C7289jT0.l();
        i = bVar.a1;
        if (i == 0) {
        }
        while (it.hasNext()) {
        }
        return C7458kA2.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0052 -> B:19:0x0055). Please submit an issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(@NotNull RU0[] ru0Arr, @NotNull HM<? super C7458kA2> hm) {
        a aVar;
        int i;
        int i2;
        RU0[] ru0Arr2;
        int length;
        if (hm instanceof a) {
            aVar = (a) hm;
            int i3 = aVar.c1;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.c1 = i3 - Integer.MIN_VALUE;
                Object obj = aVar.b1;
                Object l = C7289jT0.l();
                i = aVar.c1;
                if (i == 0) {
                    if (i == 1) {
                        length = aVar.a1;
                        i2 = aVar.Z0;
                        RT1.n(obj);
                        ru0Arr2 = (RU0[]) aVar.Y0;
                        i2++;
                        if (i2 < length) {
                            RU0 ru0 = ru0Arr2[i2];
                            aVar.Y0 = ru0Arr2;
                            aVar.Z0 = i2;
                            aVar.a1 = length;
                            aVar.c1 = 1;
                            if (ru0.T(aVar) == l) {
                                return l;
                            }
                            i2++;
                            if (i2 < length) {
                                return C7458kA2.a;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    i2 = 0;
                    ru0Arr2 = ru0Arr;
                    length = ru0Arr.length;
                    if (i2 < length) {
                    }
                }
            }
        }
        aVar = new a(hm);
        Object obj2 = aVar.b1;
        Object l2 = C7289jT0.l();
        i = aVar.c1;
        if (i == 0) {
        }
    }
}
