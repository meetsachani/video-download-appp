package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nWhileSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,29:1\n54#2,5:30\n*S KotlinDebug\n*F\n+ 1 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n*L\n27#1:30,5\n*E\n"})
/* loaded from: classes4.dex */
public final class PK2 {

    @FV(c = "kotlinx.coroutines.selects.WhileSelectKt", f = "WhileSelect.kt", i = {0}, l = {34}, m = "whileSelect", n = {"builder"}, s = {"L$0"})
    /* loaded from: classes4.dex */
    public static final class a extends KM {
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
            return PK2.a(null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004c -> B:18:0x004f). Please submit an issue!!! */
    @o.InterfaceC2951Fi0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull o.HA0<? super o.XZ1<? super java.lang.Boolean>, o.C7458kA2> r4, @org.jetbrains.annotations.NotNull o.HM<? super o.C7458kA2> r5) {
        /*
            boolean r0 = r5 instanceof o.PK2.a
            if (r0 == 0) goto L13
            r0 = r5
            o.PK2$a r0 = (o.PK2.a) r0
            int r1 = r0.a1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.a1 = r1
            goto L18
        L13:
            o.PK2$a r0 = new o.PK2$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.Z0
            java.lang.Object r1 = o.C7289jT0.l()
            int r2 = r0.a1
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.Y0
            o.HA0 r4 = (o.HA0) r4
            o.RT1.n(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            o.RT1.n(r5)
        L38:
            o.g02 r5 = new o.g02
            o.dQ r2 = r0.getContext()
            r5.<init>(r2)
            r4.invoke(r5)
            r0.Y0 = r4
            r0.a1 = r3
            java.lang.Object r5 = r5.w(r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L38
            o.kA2 r4 = o.C7458kA2.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.PK2.a(o.HA0, o.HM):java.lang.Object");
    }

    @InterfaceC2951Fi0
    public static final Object b(HA0<? super XZ1<? super Boolean>, C7458kA2> ha0, HM<? super C7458kA2> hm) {
        UP0.e(3);
        throw null;
    }
}
