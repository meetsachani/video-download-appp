package o;

import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nOnTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnTimeout.kt\nkotlinx/coroutines/selects/OnTimeout\n+ 2 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,62:1\n13#2:63\n*S KotlinDebug\n*F\n+ 1 OnTimeout.kt\nkotlinx/coroutines/selects/OnTimeout\n*L\n52#1:63\n*E\n"})
/* renamed from: o.lv1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7882lv1 {
    public final long a;

    @InterfaceC8303na2({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 OnTimeout.kt\nkotlinx/coroutines/selects/OnTimeout\n*L\n1#1,13:1\n53#2,2:14\n*E\n"})
    /* renamed from: o.lv1$a */
    /* loaded from: classes4.dex */
    public static final class a implements Runnable {
        public final /* synthetic */ InterfaceC6691h02 X;
        public final /* synthetic */ C7882lv1 Y;

        public a(InterfaceC6691h02 interfaceC6691h02, C7882lv1 c7882lv1) {
            this.X = interfaceC6691h02;
            this.Y = c7882lv1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.X.h(this.Y, C7458kA2.a);
        }
    }

    /* renamed from: o.lv1$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b extends C7964mB0 implements XA0<C7882lv1, InterfaceC6691h02<?>, Object, C7458kA2> {
        public static final b e1 = new b();

        public b() {
            super(3, C7882lv1.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // o.XA0
        public /* bridge */ /* synthetic */ C7458kA2 P(C7882lv1 c7882lv1, InterfaceC6691h02<?> interfaceC6691h02, Object obj) {
            u0(c7882lv1, interfaceC6691h02, obj);
            return C7458kA2.a;
        }

        public final void u0(C7882lv1 c7882lv1, InterfaceC6691h02<?> interfaceC6691h02, Object obj) {
            c7882lv1.d(interfaceC6691h02, obj);
        }
    }

    public C7882lv1(long j) {
        this.a = j;
    }

    @NotNull
    public final ZZ1 b() {
        b bVar = b.e1;
        C6562gT0.n(bVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new C4980a02(this, (XA0) C11313zv2.q(bVar, 3), null, 4, null);
    }

    public final void d(InterfaceC6691h02<?> interfaceC6691h02, Object obj) {
        if (this.a <= 0) {
            interfaceC6691h02.e(C7458kA2.a);
            return;
        }
        a aVar = new a(interfaceC6691h02, this);
        C6562gT0.n(interfaceC6691h02, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        C6436g02 c6436g02 = (C6436g02) interfaceC6691h02;
        InterfaceC5809dQ context = c6436g02.getContext();
        c6436g02.f(P10.d(context).o(this.a, aVar, context));
    }

    public static /* synthetic */ void c() {
    }
}
