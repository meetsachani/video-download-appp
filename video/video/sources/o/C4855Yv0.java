package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Yv0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C4855Yv0 {

    @FV(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", i = {0}, l = {22}, m = "toCollection", n = {"destination"}, s = {"L$0"})
    /* renamed from: o.Yv0$a */
    /* loaded from: classes4.dex */
    public static final class a<T, C extends Collection<? super T>> extends KM {
        public Object Y0;
        public /* synthetic */ Object Z0;
        public int a1;

        public a(HM<? super a> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.Z0 = obj;
            this.a1 |= Integer.MIN_VALUE;
            return C4467Uv0.W1(null, null, this);
        }
    }

    /* JADX WARN: Incorrect field signature: TC; */
    /* renamed from: o.Yv0$b */
    /* loaded from: classes4.dex */
    public static final class b<T> implements InterfaceC4076Qv0 {
        public final /* synthetic */ Collection X;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        public b(Collection collection) {
            this.X = collection;
        }

        @Override // o.InterfaceC4076Qv0
        public final Object c(T t, HM<? super C7458kA2> hm) {
            this.X.add(t);
            return C7458kA2.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T, C extends Collection<? super T>> Object a(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull C c, @NotNull HM<? super C> hm) {
        a aVar;
        int i;
        if (hm instanceof a) {
            aVar = (a) hm;
            int i2 = aVar.a1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.a1 = i2 - Integer.MIN_VALUE;
                Object obj = aVar.Z0;
                Object l = C7289jT0.l();
                i = aVar.a1;
                if (i == 0) {
                    if (i == 1) {
                        Collection collection = (Collection) aVar.Y0;
                        RT1.n(obj);
                        return collection;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RT1.n(obj);
                InterfaceC4076Qv0<? super Object> bVar = new b<>(c);
                aVar.Y0 = c;
                aVar.a1 = 1;
                if (interfaceC3882Ov0.a(bVar, aVar) == l) {
                    return l;
                }
                return c;
            }
        }
        aVar = new a(hm);
        Object obj2 = aVar.Z0;
        Object l2 = C7289jT0.l();
        i = aVar.a1;
        if (i == 0) {
        }
    }

    @Nullable
    public static final <T> Object b(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull List<T> list, @NotNull HM<? super List<? extends T>> hm) {
        return C4467Uv0.W1(interfaceC3882Ov0, list, hm);
    }

    public static /* synthetic */ Object c(InterfaceC3882Ov0 interfaceC3882Ov0, List list, HM hm, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return C4467Uv0.X1(interfaceC3882Ov0, list, hm);
    }

    @Nullable
    public static final <T> Object d(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull Set<T> set, @NotNull HM<? super Set<? extends T>> hm) {
        return C4467Uv0.W1(interfaceC3882Ov0, set, hm);
    }

    public static /* synthetic */ Object e(InterfaceC3882Ov0 interfaceC3882Ov0, Set set, HM hm, int i, Object obj) {
        if ((i & 1) != 0) {
            set = new LinkedHashSet();
        }
        return C4467Uv0.Z1(interfaceC3882Ov0, set, hm);
    }
}
