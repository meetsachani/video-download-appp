package o;

import o.InterfaceC8148mw2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.rA */
/* loaded from: classes3.dex */
public interface InterfaceC9181rA<E> {

    /* renamed from: o.rA$a */
    /* loaded from: classes3.dex */
    public static final class a {

        @FV(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", i = {0}, l = {InterfaceC8148mw2.e.r}, m = "next", n = {"$this"}, s = {"L$0"})
        /* renamed from: o.rA$a$a */
        /* loaded from: classes3.dex */
        public static final class C0331a<E> extends KM {
            public Object Y0;
            public /* synthetic */ Object Z0;
            public int a1;

            public C0331a(HM<? super C0331a> hm) {
                super(hm);
            }

            @Override // o.AbstractC5644cl
            @Nullable
            public final Object F(@NotNull Object obj) {
                this.Z0 = obj;
                this.a1 |= Integer.MIN_VALUE;
                return a.a(null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0050  */
        @InterfaceC8046mW0(name = "next")
        @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ Object a(InterfaceC9181rA interfaceC9181rA, HM hm) {
            C0331a c0331a;
            Object obj;
            int i;
            if (hm instanceof C0331a) {
                c0331a = (C0331a) hm;
                int i2 = c0331a.a1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0331a.a1 = i2 - Integer.MIN_VALUE;
                    obj = c0331a.Z0;
                    Object l = C7289jT0.l();
                    i = c0331a.a1;
                    if (i == 0) {
                        if (i == 1) {
                            interfaceC9181rA = (InterfaceC9181rA) c0331a.Y0;
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        c0331a.Y0 = interfaceC9181rA;
                        c0331a.a1 = 1;
                        obj = interfaceC9181rA.a(c0331a);
                        if (obj == l) {
                            return l;
                        }
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        return interfaceC9181rA.next();
                    }
                    throw new C7471kE(C11128zA.a);
                }
            }
            c0331a = new C0331a(hm);
            obj = c0331a.Z0;
            Object l2 = C7289jT0.l();
            i = c0331a.a1;
            if (i == 0) {
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        }
    }

    @Nullable
    Object a(@NotNull HM<? super Boolean> hm);

    @InterfaceC8046mW0(name = "next")
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
    /* synthetic */ Object b(HM hm);

    E next();
}
