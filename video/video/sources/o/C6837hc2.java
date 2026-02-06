package o;

import java.util.List;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nSharingStarted.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharingStarted.kt\nkotlinx/coroutines/flow/StartedWhileSubscribed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
/* renamed from: o.hc2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6837hc2 implements InterfaceC7677l42 {
    public final long b;
    public final long c;

    @FV(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {C10997yd1.y1, 176, 178, 179, 181}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
    /* renamed from: o.hc2$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC4225Si2 implements XA0<InterfaceC4076Qv0<? super EnumC7191j42>, Integer, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public /* synthetic */ int b1;

        public a(HM<? super a> hm) {
            super(3, hm);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
            if (r1.c(r10, r9) == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
            if (o.P10.b(r6, r9) == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
            if (r1.c(r10, r9) == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
            if (o.P10.b(r4, r9) == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
            if (r1.c(r10, r9) != r0) goto L15;
         */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            InterfaceC4076Qv0 interfaceC4076Qv0;
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                interfaceC4076Qv0 = (InterfaceC4076Qv0) this.a1;
                                RT1.n(obj);
                                EnumC7191j42 enumC7191j42 = EnumC7191j42.Z;
                                this.a1 = null;
                                this.Z0 = 5;
                            }
                        } else {
                            interfaceC4076Qv0 = (InterfaceC4076Qv0) this.a1;
                            RT1.n(obj);
                            long j = C6837hc2.this.c;
                            this.a1 = interfaceC4076Qv0;
                            this.Z0 = 4;
                        }
                    } else {
                        interfaceC4076Qv0 = (InterfaceC4076Qv0) this.a1;
                        RT1.n(obj);
                        if (C6837hc2.this.c > 0) {
                            EnumC7191j42 enumC7191j422 = EnumC7191j42.Y;
                            this.a1 = interfaceC4076Qv0;
                            this.Z0 = 3;
                        }
                        EnumC7191j42 enumC7191j423 = EnumC7191j42.Z;
                        this.a1 = null;
                        this.Z0 = 5;
                    }
                }
                RT1.n(obj);
                return C7458kA2.a;
            }
            RT1.n(obj);
            interfaceC4076Qv0 = (InterfaceC4076Qv0) this.a1;
            if (this.b1 <= 0) {
                long j2 = C6837hc2.this.b;
                this.a1 = interfaceC4076Qv0;
                this.Z0 = 2;
            } else {
                EnumC7191j42 enumC7191j424 = EnumC7191j42.X;
                this.Z0 = 1;
            }
            return l;
        }

        @Override // o.XA0
        public /* bridge */ /* synthetic */ Object P(InterfaceC4076Qv0<? super EnumC7191j42> interfaceC4076Qv0, Integer num, HM<? super C7458kA2> hm) {
            return U(interfaceC4076Qv0, num.intValue(), hm);
        }

        public final Object U(InterfaceC4076Qv0<? super EnumC7191j42> interfaceC4076Qv0, int i, HM<? super C7458kA2> hm) {
            a aVar = new a(hm);
            aVar.a1 = interfaceC4076Qv0;
            aVar.b1 = i;
            return aVar.F(C7458kA2.a);
        }
    }

    @FV(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.hc2$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC4225Si2 implements VA0<EnumC7191j42, HM<? super Boolean>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;

        public b(HM<? super b> hm) {
            super(2, hm);
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            boolean z;
            C7289jT0.l();
            if (this.Z0 == 0) {
                RT1.n(obj);
                if (((EnumC7191j42) this.a1) != EnumC7191j42.X) {
                    z = true;
                } else {
                    z = false;
                }
                return C10557wp.a(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(EnumC7191j42 enumC7191j42, HM<? super Boolean> hm) {
            return ((b) t(enumC7191j42, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            b bVar = new b(hm);
            bVar.a1 = obj;
            return bVar;
        }
    }

    public C6837hc2(long j, long j2) {
        this.b = j;
        this.c = j2;
        if (j >= 0) {
            if (j2 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("replayExpiration(" + j2 + " ms) cannot be negative").toString());
        }
        throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
    }

    @Override // o.InterfaceC7677l42
    @NotNull
    public InterfaceC3882Ov0<EnumC7191j42> a(@NotNull InterfaceC9041qc2<Integer> interfaceC9041qc2) {
        return C4467Uv0.g0(C4467Uv0.k0(C4467Uv0.c2(interfaceC9041qc2, new a(null)), new b(null)));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C6837hc2) {
            C6837hc2 c6837hc2 = (C6837hc2) obj;
            if (this.b == c6837hc2.b && this.c == c6837hc2.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (Long.hashCode(this.b) * 31) + Long.hashCode(this.c);
    }

    @NotNull
    public String toString() {
        List j = C7979mF.j(2);
        if (this.b > 0) {
            j.add("stopTimeout=" + this.b + "ms");
        }
        if (this.c < Long.MAX_VALUE) {
            j.add("replayExpiration=" + this.c + "ms");
        }
        List a2 = C7979mF.a(j);
        return "SharingStarted.WhileSubscribed(" + C10662xF.p3(a2, null, null, null, 0, null, null, 63, null) + ')';
    }
}
