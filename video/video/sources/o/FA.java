package o;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import o.InterfaceC8148mw2;
import o.OO1;
import o.RP1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,509:1\n24#1,5:510\n94#2,8:515\n94#2,8:523\n94#2,8:531\n94#2,8:539\n160#2:547\n94#2,3:548\n161#2:551\n101#2:552\n162#2:553\n97#2,3:554\n94#2,8:557\n160#2:565\n94#2,3:566\n161#2,2:569\n101#2:571\n97#2,3:572\n94#2,8:575\n94#2,8:583\n94#2,8:591\n160#2:599\n94#2,3:600\n161#2,2:603\n101#2:605\n97#2,3:606\n160#2:609\n94#2,3:610\n161#2,2:613\n101#2:615\n97#2,3:616\n160#2:619\n94#2,3:620\n161#2,2:623\n101#2:625\n97#2,3:626\n160#2:629\n94#2,3:630\n161#2,2:633\n101#2:635\n97#2,3:636\n160#2:639\n94#2,3:640\n161#2,2:643\n101#2:645\n97#2,3:646\n94#2,8:649\n160#2:657\n94#2,3:658\n161#2,2:661\n101#2:663\n97#2,3:664\n94#2,8:667\n94#2,8:675\n94#2,8:683\n1#3:691\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt\n*L\n40#1:510,5\n64#1:515,8\n79#1:523,8\n93#1:531,8\n103#1:539,8\n114#1:547\n114#1:548,3\n114#1:551\n114#1:552\n114#1:553\n114#1:554,3\n125#1:557,8\n140#1:565\n140#1:566,3\n140#1:569,2\n140#1:571\n140#1:572,3\n151#1:575,8\n164#1:583,8\n177#1:591,8\n262#1:599\n262#1:600,3\n262#1:603,2\n262#1:605\n262#1:606,3\n271#1:609\n271#1:610,3\n271#1:613,2\n271#1:615\n271#1:616,3\n307#1:619\n307#1:620,3\n307#1:623,2\n307#1:625\n307#1:626,3\n315#1:629\n315#1:630,3\n315#1:633,2\n315#1:635\n315#1:636,3\n328#1:639\n328#1:640,3\n328#1:643,2\n328#1:645\n328#1:646,3\n433#1:649,8\n441#1:657\n441#1:658,3\n441#1:661,2\n441#1:663\n441#1:664,3\n448#1:667,8\n462#1:675,8\n476#1:683,8\n*E\n"})
/* loaded from: classes3.dex */
public final /* synthetic */ class FA {

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {477}, m = "none", n = {"$this$consume$iv"}, s = {"L$0"})
    /* loaded from: classes3.dex */
    public static final class A<E> extends KM {
        public Object Y0;
        public /* synthetic */ Object Z0;
        public int a1;

        public A(HM<? super A> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            Object W;
            this.Z0 = obj;
            this.a1 |= Integer.MIN_VALUE;
            W = FA.W(null, this);
            return W;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class B extends AbstractC4225Si2 implements VA0<Object, HM<Object>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ OO1<Object> b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(OO1<Object> oo1, HM<? super B> hm) {
            super(2, hm);
            this.b1 = oo1;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            C7289jT0.l();
            if (this.Z0 == 0) {
                RT1.n(obj);
                Object obj2 = this.a1;
                if (obj2 != null) {
                    return obj2;
                }
                throw new IllegalArgumentException("null element found in " + this.b1 + '.');
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(Object obj, HM<Object> hm) {
            return ((B) t(obj, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            B b = new B(this.b1, hm);
            b.a1 = obj;
            return b;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {C10997yd1.t1, C7834lj1.G}, m = "single", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class C<E> extends KM {
        public Object Y0;
        public Object Z0;
        public /* synthetic */ Object a1;
        public int b1;

        public C(HM<? super C> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            Object Y;
            this.a1 = obj;
            this.b1 |= Integer.MIN_VALUE;
            Y = FA.Y(null, this);
            return Y;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {179, FF0.q}, m = "singleOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class D<E> extends KM {
        public Object Y0;
        public Object Z0;
        public /* synthetic */ Object a1;
        public int b1;

        public D(HM<? super D> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            Object Z;
            this.a1 = obj;
            this.b1 |= Integer.MIN_VALUE;
            Z = FA.Z(null, this);
            return Z;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {284, 285}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "remaining"}, s = {"L$0", "I$0", "L$0", "I$0"})
    @InterfaceC8303na2({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$take$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,509:1\n1#2:510\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class E extends AbstractC4225Si2 implements VA0<AI1<Object>, HM<? super C7458kA2>, Object> {
        public Object Z0;
        public int a1;
        public int b1;
        public /* synthetic */ Object c1;
        public final /* synthetic */ int d1;
        public final /* synthetic */ OO1<Object> e1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public E(int i, OO1<Object> oo1, HM<? super E> hm) {
            super(2, hm);
            this.d1 = i;
            this.e1 = oo1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:64:0x0078, code lost:
            if (r5.d0(r8, r7) == r0) goto L19;
         */
        /* JADX WARN: Removed duplicated region for block: B:60:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0078 -> B:44:0x001b). Please submit an issue!!! */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            AI1 ai1;
            int i;
            boolean z;
            InterfaceC9181rA<Object> it;
            AI1 ai12;
            Object a;
            Object l = C7289jT0.l();
            int i2 = this.b1;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        i = this.a1;
                        it = (InterfaceC9181rA) this.Z0;
                        ai12 = (AI1) this.c1;
                        RT1.n(obj);
                        ai1 = ai12;
                        i--;
                        if (i == 0) {
                            return C7458kA2.a;
                        }
                        this.c1 = ai1;
                        this.Z0 = it;
                        this.a1 = i;
                        this.b1 = 1;
                        a = it.a(this);
                        if (a != l) {
                            ai12 = ai1;
                            obj = a;
                            if (!((Boolean) obj).booleanValue()) {
                                Object next = it.next();
                                this.c1 = ai12;
                                this.Z0 = it;
                                this.a1 = i;
                                this.b1 = 2;
                            } else {
                                return C7458kA2.a;
                            }
                        }
                        return l;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.a1;
                it = (InterfaceC9181rA) this.Z0;
                ai12 = (AI1) this.c1;
                RT1.n(obj);
                if (!((Boolean) obj).booleanValue()) {
                }
            } else {
                RT1.n(obj);
                ai1 = (AI1) this.c1;
                i = this.d1;
                if (i == 0) {
                    return C7458kA2.a;
                }
                if (i >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    it = this.e1.iterator();
                    this.c1 = ai1;
                    this.Z0 = it;
                    this.a1 = i;
                    this.b1 = 1;
                    a = it.a(this);
                    if (a != l) {
                    }
                    return l;
                }
                throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
            }
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(AI1<Object> ai1, HM<? super C7458kA2> hm) {
            return ((E) t(ai1, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            E e = new E(this.d1, this.e1, hm);
            e.c1 = obj;
            return e;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {299, 300, 301}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", W12.i, "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    /* loaded from: classes3.dex */
    public static final class F extends AbstractC4225Si2 implements VA0<AI1<Object>, HM<? super C7458kA2>, Object> {
        public Object Z0;
        public Object a1;
        public int b1;
        public /* synthetic */ Object c1;
        public final /* synthetic */ OO1<Object> d1;
        public final /* synthetic */ VA0<Object, HM<? super Boolean>, Object> e1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public F(OO1<Object> oo1, VA0<Object, ? super HM<? super Boolean>, ? extends Object> va0, HM<? super F> hm) {
            super(2, hm);
            this.d1 = oo1;
            this.e1 = va0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x0057, code lost:
            if (r9 == r0) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0087  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0097 -> B:45:0x004d). Please submit an issue!!! */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            InterfaceC9181rA<Object> it;
            AI1 ai1;
            AI1 ai12;
            InterfaceC9181rA<Object> interfaceC9181rA;
            Object obj2;
            Object l = C7289jT0.l();
            int i = this.b1;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            it = (InterfaceC9181rA) this.Z0;
                            ai1 = (AI1) this.c1;
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        obj2 = this.a1;
                        interfaceC9181rA = (InterfaceC9181rA) this.Z0;
                        ai12 = (AI1) this.c1;
                        RT1.n(obj);
                        if (((Boolean) obj).booleanValue()) {
                            return C7458kA2.a;
                        }
                        this.c1 = ai12;
                        this.Z0 = interfaceC9181rA;
                        this.a1 = null;
                        this.b1 = 3;
                        if (ai12.d0(obj2, this) != l) {
                            it = interfaceC9181rA;
                            ai1 = ai12;
                        }
                        return l;
                    }
                } else {
                    it = (InterfaceC9181rA) this.Z0;
                    ai1 = (AI1) this.c1;
                    RT1.n(obj);
                    if (((Boolean) obj).booleanValue()) {
                        Object next = it.next();
                        VA0<Object, HM<? super Boolean>, Object> va0 = this.e1;
                        this.c1 = ai1;
                        this.Z0 = it;
                        this.a1 = next;
                        this.b1 = 2;
                        Object i2 = va0.i(next, this);
                        if (i2 != l) {
                            InterfaceC9181rA<Object> interfaceC9181rA2 = it;
                            obj2 = next;
                            obj = i2;
                            ai12 = ai1;
                            interfaceC9181rA = interfaceC9181rA2;
                            if (((Boolean) obj).booleanValue()) {
                            }
                        }
                        return l;
                    }
                    return C7458kA2.a;
                }
            } else {
                RT1.n(obj);
                it = this.d1.iterator();
                ai1 = (AI1) this.c1;
            }
            this.c1 = ai1;
            this.Z0 = it;
            this.b1 = 1;
            obj = it.a(this);
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(AI1<Object> ai1, HM<? super C7458kA2> hm) {
            return ((F) t(ai1, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            F f = new F(this.d1, this.e1, hm);
            f.c1 = obj;
            return f;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {514, 308}, m = "toChannel", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class G<E, C extends InterfaceC10362w02<? super E>> extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public /* synthetic */ Object b1;
        public int c1;

        public G(HM<? super G> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.b1 = obj;
            this.c1 |= Integer.MIN_VALUE;
            return C11128zA.e0(null, null, this);
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {514}, m = "toCollection", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class H<E, C extends Collection<? super E>> extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public /* synthetic */ Object b1;
        public int c1;

        public H(HM<? super H> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.b1 = obj;
            this.c1 |= Integer.MIN_VALUE;
            return C11128zA.f0(null, null, this);
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {514}, m = "toMap", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class I<K, V, M extends Map<? super K, ? super V>> extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public /* synthetic */ Object b1;
        public int c1;

        public I(HM<? super I> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.b1 = obj;
            this.c1 |= Integer.MIN_VALUE;
            return C11128zA.h0(null, null, this);
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {400, 401}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0"})
    /* loaded from: classes3.dex */
    public static final class J extends AbstractC4225Si2 implements VA0<AI1<? super C9485sP0<Object>>, HM<? super C7458kA2>, Object> {
        public Object Z0;
        public int a1;
        public int b1;
        public /* synthetic */ Object c1;
        public final /* synthetic */ OO1<Object> d1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public J(OO1<Object> oo1, HM<? super J> hm) {
            super(2, hm);
            this.d1 = oo1;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x007b -> B:31:0x001e). Please submit an issue!!! */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            AI1 ai1;
            InterfaceC9181rA<Object> it;
            int i;
            AI1 ai12;
            InterfaceC9181rA<Object> interfaceC9181rA;
            int i2;
            Object a;
            Object l = C7289jT0.l();
            int i3 = this.b1;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = this.a1;
                        InterfaceC9181rA<Object> interfaceC9181rA2 = (InterfaceC9181rA) this.Z0;
                        ai12 = (AI1) this.c1;
                        RT1.n(obj);
                        i = i4;
                        it = interfaceC9181rA2;
                        ai1 = ai12;
                        this.c1 = ai1;
                        this.Z0 = it;
                        this.a1 = i;
                        this.b1 = 1;
                        a = it.a(this);
                        if (a != l) {
                            ai12 = ai1;
                            obj = a;
                            int i5 = i;
                            interfaceC9181rA = it;
                            i2 = i5;
                            if (!((Boolean) obj).booleanValue()) {
                                int i6 = i2 + 1;
                                C9485sP0 c9485sP0 = new C9485sP0(i2, interfaceC9181rA.next());
                                this.c1 = ai12;
                                this.Z0 = interfaceC9181rA;
                                this.a1 = i6;
                                this.b1 = 2;
                                if (ai12.d0(c9485sP0, this) != l) {
                                    it = interfaceC9181rA;
                                    i = i6;
                                    ai1 = ai12;
                                    this.c1 = ai1;
                                    this.Z0 = it;
                                    this.a1 = i;
                                    this.b1 = 1;
                                    a = it.a(this);
                                    if (a != l) {
                                    }
                                }
                            } else {
                                return C7458kA2.a;
                            }
                        }
                        return l;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.a1;
                interfaceC9181rA = (InterfaceC9181rA) this.Z0;
                ai12 = (AI1) this.c1;
                RT1.n(obj);
                if (!((Boolean) obj).booleanValue()) {
                }
            } else {
                RT1.n(obj);
                ai1 = (AI1) this.c1;
                it = this.d1.iterator();
                i = 0;
                this.c1 = ai1;
                this.Z0 = it;
                this.a1 = i;
                this.b1 = 1;
                a = it.a(this);
                if (a != l) {
                }
                return l;
            }
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(AI1<? super C9485sP0<Object>> ai1, HM<? super C7458kA2> hm) {
            return ((J) t(ai1, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            J j = new J(this.d1, hm);
            j.c1 = obj;
            return j;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {514, 499, InterfaceC8148mw2.g.i}, m = "invokeSuspend", n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
    @InterfaceC8303na2({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$zip$2\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,509:1\n160#2:510\n94#2,3:511\n161#2,2:514\n101#2:516\n97#2,3:517\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$zip$2\n*L\n498#1:510\n498#1:511,3\n498#1:514,2\n498#1:516\n498#1:517,3\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class K<V> extends AbstractC4225Si2 implements VA0<AI1<? super V>, HM<? super C7458kA2>, Object> {
        public Object Z0;
        public Object a1;
        public Object b1;
        public Object c1;
        public Object d1;
        public int e1;
        public /* synthetic */ Object f1;
        public final /* synthetic */ OO1<R> g1;
        public final /* synthetic */ OO1<E> h1;
        public final /* synthetic */ VA0<E, R, V> i1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public K(OO1<? extends R> oo1, OO1<? extends E> oo12, VA0<? super E, ? super R, ? extends V> va0, HM<? super K> hm) {
            super(2, hm);
            this.g1 = oo1;
            this.h1 = oo12;
            this.i1 = va0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:88:0x00e7, code lost:
            if (r10.d0(r13, r12) == r0) goto L12;
         */
        /* JADX WARN: Removed duplicated region for block: B:81:0x00a5 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #2 {all -> 0x002a, blocks: (B:60:0x0026, B:76:0x0088, B:79:0x009d, B:81:0x00a5, B:91:0x00ef, B:72:0x006b, B:75:0x0080), top: B:102:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00cd A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:85:0x00c5, B:87:0x00cd, B:67:0x004b), top: B:98:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x00ef A[Catch: all -> 0x002a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002a, blocks: (B:60:0x0026, B:76:0x0088, B:79:0x009d, B:81:0x00a5, B:91:0x00ef, B:72:0x006b, B:75:0x0080), top: B:102:0x000a }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x00ea -> B:76:0x0088). Please submit an issue!!! */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            OO1 oo1;
            VA0 va0;
            InterfaceC9181rA interfaceC9181rA;
            InterfaceC9181rA it;
            AI1 ai1;
            OO1 oo12;
            AI1 ai12;
            InterfaceC9181rA interfaceC9181rA2;
            VA0 va02;
            Object obj2;
            Object l = C7289jT0.l();
            int i = this.e1;
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                it = (InterfaceC9181rA) this.c1;
                                oo1 = (OO1) this.b1;
                                va0 = (VA0) this.a1;
                                interfaceC9181rA = (InterfaceC9181rA) this.Z0;
                                ai1 = (AI1) this.f1;
                                RT1.n(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Object obj3 = this.d1;
                            InterfaceC9181rA interfaceC9181rA3 = (InterfaceC9181rA) this.c1;
                            oo12 = (OO1) this.b1;
                            va02 = (VA0) this.a1;
                            interfaceC9181rA2 = (InterfaceC9181rA) this.Z0;
                            ai12 = (AI1) this.f1;
                            try {
                                RT1.n(obj);
                                obj2 = obj3;
                                it = interfaceC9181rA3;
                                if (((Boolean) obj).booleanValue()) {
                                    Object i2 = va02.i(obj2, interfaceC9181rA2.next());
                                    this.f1 = ai12;
                                    this.Z0 = interfaceC9181rA2;
                                    this.a1 = va02;
                                    this.b1 = oo12;
                                    this.c1 = it;
                                    this.d1 = null;
                                    this.e1 = 3;
                                }
                                oo1 = oo12;
                                va0 = va02;
                                interfaceC9181rA = interfaceC9181rA2;
                                ai1 = ai12;
                            } catch (Throwable th) {
                                th = th;
                                oo1 = oo12;
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    C11128zA.b(oo1, th);
                                    throw th2;
                                }
                            }
                        }
                    } else {
                        it = (InterfaceC9181rA) this.c1;
                        oo1 = (OO1) this.b1;
                        va0 = (VA0) this.a1;
                        interfaceC9181rA = (InterfaceC9181rA) this.Z0;
                        ai1 = (AI1) this.f1;
                        RT1.n(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            Object next = it.next();
                            this.f1 = ai1;
                            this.Z0 = interfaceC9181rA;
                            this.a1 = va0;
                            this.b1 = oo1;
                            this.c1 = it;
                            this.d1 = next;
                            this.e1 = 2;
                            Object a = interfaceC9181rA.a(this);
                            if (a != l) {
                                OO1 oo13 = oo1;
                                obj2 = next;
                                obj = a;
                                ai12 = ai1;
                                interfaceC9181rA2 = interfaceC9181rA;
                                va02 = va0;
                                oo12 = oo13;
                                if (((Boolean) obj).booleanValue()) {
                                }
                                oo1 = oo12;
                                va0 = va02;
                                interfaceC9181rA = interfaceC9181rA2;
                                ai1 = ai12;
                            }
                            return l;
                        }
                        C7458kA2 c7458kA2 = C7458kA2.a;
                        C11128zA.b(oo1, null);
                        return c7458kA2;
                    }
                } else {
                    RT1.n(obj);
                    AI1 ai13 = (AI1) this.f1;
                    InterfaceC9181rA it2 = this.g1.iterator();
                    oo1 = this.h1;
                    va0 = this.i1;
                    interfaceC9181rA = it2;
                    it = oo1.iterator();
                    ai1 = ai13;
                }
                this.f1 = ai1;
                this.Z0 = interfaceC9181rA;
                this.a1 = va0;
                this.b1 = oo1;
                this.c1 = it;
                this.d1 = null;
                this.e1 = 1;
                obj = it.a(this);
                if (obj == l) {
                    return l;
                }
                if (!((Boolean) obj).booleanValue()) {
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(AI1<? super V> ai1, HM<? super C7458kA2> hm) {
            return ((K) t(ai1, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            K k = new K(this.g1, this.h1, this.i1, hm);
            k.f1 = obj;
            return k;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {C9196rD2.c}, m = "any", n = {"$this$consume$iv"}, s = {"L$0"})
    /* renamed from: o.FA$a */
    /* loaded from: classes3.dex */
    public static final class C2907a<E> extends KM {
        public Object Y0;
        public /* synthetic */ Object Z0;
        public int a1;

        public C2907a(HM<? super C2907a> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            Object d;
            this.Z0 = obj;
            this.a1 |= Integer.MIN_VALUE;
            d = FA.d(null, this);
            return d;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {41}, m = "consumeEach", n = {"action", "channel$iv"}, s = {"L$0", "L$1"})
    /* renamed from: o.FA$b */
    /* loaded from: classes3.dex */
    public static final class C2908b<E> extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public /* synthetic */ Object b1;
        public int c1;

        public C2908b(HM<? super C2908b> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.b1 = obj;
            this.c1 |= Integer.MIN_VALUE;
            return FA.f(null, null, this);
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {514}, m = "count", n = {"count", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    /* renamed from: o.FA$c */
    /* loaded from: classes3.dex */
    public static final class C2909c<E> extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public /* synthetic */ Object b1;
        public int c1;

        public C2909c(HM<? super C2909c> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            Object l;
            this.b1 = obj;
            this.c1 |= Integer.MIN_VALUE;
            l = FA.l(null, this);
            return l;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.FA$d */
    /* loaded from: classes3.dex */
    public static final class C2910d extends AbstractC4225Si2 implements VA0<Object, HM<Object>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;

        public C2910d(HM<? super C2910d> hm) {
            super(2, hm);
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            C7289jT0.l();
            if (this.Z0 == 0) {
                RT1.n(obj);
                return this.a1;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(Object obj, HM<Object> hm) {
            return ((C2910d) t(obj, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            C2910d c2910d = new C2910d(hm);
            c2910d.a1 = obj;
            return c2910d;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {417, 418, InterfaceC8148mw2.c.r}, m = "invokeSuspend", n = {"$this$produce", "keys", "$this$produce", "keys", W12.i, "$this$produce", "keys", "k"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
    /* renamed from: o.FA$e */
    /* loaded from: classes3.dex */
    public static final class C2911e<E> extends AbstractC4225Si2 implements VA0<AI1<? super E>, HM<? super C7458kA2>, Object> {
        public Object Z0;
        public Object a1;
        public Object b1;
        public int c1;
        public /* synthetic */ Object d1;
        public final /* synthetic */ OO1<E> e1;
        public final /* synthetic */ VA0<E, HM<? super K>, Object> f1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2911e(OO1<? extends E> oo1, VA0<? super E, ? super HM<? super K>, ? extends Object> va0, HM<? super C2911e> hm) {
            super(2, hm);
            this.e1 = oo1;
            this.f1 = va0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x0076, code lost:
            if (r11 != r0) goto L11;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
        /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v8, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00a1 -> B:61:0x00ba). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00b4 -> B:60:0x00b6). Please submit an issue!!! */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            HashSet hashSet;
            InterfaceC9181rA<E> it;
            AI1 ai1;
            AI1 ai12;
            HashSet hashSet2;
            E e;
            boolean contains;
            InterfaceC9181rA<E> interfaceC9181rA;
            Object obj2;
            HashSet hashSet3;
            Object l = C7289jT0.l();
            int i = this.c1;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            obj2 = this.b1;
                            interfaceC9181rA = (InterfaceC9181rA) this.a1;
                            hashSet2 = (HashSet) this.Z0;
                            ai12 = (AI1) this.d1;
                            RT1.n(obj);
                            hashSet2.add(obj2);
                            it = interfaceC9181rA;
                            hashSet3 = hashSet2;
                            hashSet = hashSet3;
                            ai1 = ai12;
                            this.d1 = ai1;
                            this.Z0 = hashSet;
                            this.a1 = it;
                            this.b1 = null;
                            this.c1 = 1;
                            obj = it.a(this);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ?? r1 = this.b1;
                        InterfaceC9181rA<E> interfaceC9181rA2 = (InterfaceC9181rA) this.a1;
                        hashSet2 = (HashSet) this.Z0;
                        ai12 = (AI1) this.d1;
                        RT1.n(obj);
                        e = r1;
                        it = interfaceC9181rA2;
                        contains = hashSet2.contains(obj);
                        hashSet3 = hashSet2;
                        if (!contains) {
                            this.d1 = ai12;
                            this.Z0 = hashSet2;
                            this.a1 = it;
                            this.b1 = obj;
                            this.c1 = 3;
                            if (ai12.d0(e, this) != l) {
                                interfaceC9181rA = it;
                                obj2 = obj;
                                hashSet2.add(obj2);
                                it = interfaceC9181rA;
                                hashSet3 = hashSet2;
                            }
                            return l;
                        }
                        hashSet = hashSet3;
                        ai1 = ai12;
                        this.d1 = ai1;
                        this.Z0 = hashSet;
                        this.a1 = it;
                        this.b1 = null;
                        this.c1 = 1;
                        obj = it.a(this);
                    }
                } else {
                    it = (InterfaceC9181rA) this.a1;
                    hashSet = (HashSet) this.Z0;
                    ai1 = (AI1) this.d1;
                    RT1.n(obj);
                    if (((Boolean) obj).booleanValue()) {
                        E next = it.next();
                        VA0 va0 = this.f1;
                        this.d1 = ai1;
                        this.Z0 = hashSet;
                        this.a1 = it;
                        this.b1 = next;
                        this.c1 = 2;
                        Object i2 = va0.i(next, this);
                        if (i2 != l) {
                            HashSet hashSet4 = hashSet;
                            e = next;
                            obj = i2;
                            ai12 = ai1;
                            hashSet2 = hashSet4;
                            contains = hashSet2.contains(obj);
                            hashSet3 = hashSet2;
                            if (!contains) {
                            }
                            hashSet = hashSet3;
                            ai1 = ai12;
                            this.d1 = ai1;
                            this.Z0 = hashSet;
                            this.a1 = it;
                            this.b1 = null;
                            this.c1 = 1;
                            obj = it.a(this);
                        }
                        return l;
                    }
                    return C7458kA2.a;
                }
            } else {
                RT1.n(obj);
                HashSet hashSet5 = new HashSet();
                hashSet = hashSet5;
                it = this.e1.iterator();
                ai1 = (AI1) this.d1;
                this.d1 = ai1;
                this.Z0 = hashSet;
                this.a1 = it;
                this.b1 = null;
                this.c1 = 1;
                obj = it.a(this);
            }
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(AI1<? super E> ai1, HM<? super C7458kA2> hm) {
            return ((C2911e) t(ai1, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            C2911e c2911e = new C2911e(this.e1, this.f1, hm);
            c2911e.d1 = obj;
            return c2911e;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", f = "Deprecated.kt", i = {0, 0, 1, 2}, l = {194, 199, 200}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, s = {"L$0", "I$0", "L$0", "L$0"})
    @InterfaceC8303na2({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$drop$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,509:1\n1#2:510\n*E\n"})
    /* renamed from: o.FA$f */
    /* loaded from: classes3.dex */
    public static final class C2912f extends AbstractC4225Si2 implements VA0<AI1<Object>, HM<? super C7458kA2>, Object> {
        public Object Z0;
        public int a1;
        public int b1;
        public /* synthetic */ Object c1;
        public final /* synthetic */ int d1;
        public final /* synthetic */ OO1<Object> e1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2912f(int i, OO1<Object> oo1, HM<? super C2912f> hm) {
            super(2, hm);
            this.d1 = i;
            this.e1 = oo1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:63:0x0065, code lost:
            if (r9 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
            if (r1 == 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x00a4, code lost:
            if (r4.d0(r9, r8) == r0) goto L18;
         */
        /* JADX WARN: Removed duplicated region for block: B:74:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x00a7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0065 -> B:65:0x0068). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x00a4 -> B:50:0x001c). Please submit an issue!!! */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            AI1 ai1;
            int i;
            boolean z;
            InterfaceC9181rA<Object> it;
            AI1 ai12;
            InterfaceC9181rA<Object> it2;
            AI1 ai13;
            Object a;
            Object l = C7289jT0.l();
            int i2 = this.b1;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            it2 = (InterfaceC9181rA) this.Z0;
                            ai13 = (AI1) this.c1;
                            RT1.n(obj);
                            ai1 = ai13;
                            this.c1 = ai1;
                            this.Z0 = it2;
                            this.b1 = 2;
                            a = it2.a(this);
                            if (a != l) {
                                ai13 = ai1;
                                obj = a;
                                if (!((Boolean) obj).booleanValue()) {
                                    Object next = it2.next();
                                    this.c1 = ai13;
                                    this.Z0 = it2;
                                    this.b1 = 3;
                                } else {
                                    return C7458kA2.a;
                                }
                            }
                            return l;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it2 = (InterfaceC9181rA) this.Z0;
                    ai13 = (AI1) this.c1;
                    RT1.n(obj);
                    if (!((Boolean) obj).booleanValue()) {
                    }
                } else {
                    i = this.a1;
                    it = (InterfaceC9181rA) this.Z0;
                    ai12 = (AI1) this.c1;
                    RT1.n(obj);
                    if (((Boolean) obj).booleanValue()) {
                        it.next();
                        i--;
                    }
                    ai1 = ai12;
                    it2 = this.e1.iterator();
                    this.c1 = ai1;
                    this.Z0 = it2;
                    this.b1 = 2;
                    a = it2.a(this);
                    if (a != l) {
                    }
                    return l;
                }
            } else {
                RT1.n(obj);
                ai1 = (AI1) this.c1;
                i = this.d1;
                if (i >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (i > 0) {
                        it = this.e1.iterator();
                        ai12 = ai1;
                        this.c1 = ai12;
                        this.Z0 = it;
                        this.a1 = i;
                        this.b1 = 1;
                        obj = it.a(this);
                    }
                    it2 = this.e1.iterator();
                    this.c1 = ai1;
                    this.Z0 = it2;
                    this.b1 = 2;
                    a = it2.a(this);
                    if (a != l) {
                    }
                    return l;
                }
                throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
            }
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(AI1<Object> ai1, HM<? super C7458kA2> hm) {
            return ((C2912f) t(ai1, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            C2912f c2912f = new C2912f(this.d1, this.e1, hm);
            c2912f.c1 = obj;
            return c2912f;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2, 3, 4}, l = {211, 212, 213, 217, C9276rZ.l}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", W12.i, "$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
    /* renamed from: o.FA$g */
    /* loaded from: classes3.dex */
    public static final class C2913g extends AbstractC4225Si2 implements VA0<AI1<Object>, HM<? super C7458kA2>, Object> {
        public Object Z0;
        public Object a1;
        public int b1;
        public /* synthetic */ Object c1;
        public final /* synthetic */ OO1<Object> d1;
        public final /* synthetic */ VA0<Object, HM<? super Boolean>, Object> e1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2913g(OO1<Object> oo1, VA0<Object, ? super HM<? super Boolean>, ? extends Object> va0, HM<? super C2913g> hm) {
            super(2, hm);
            this.d1 = oo1;
            this.e1 = va0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x007f, code lost:
            if (r12 != r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x00ed, code lost:
            if (r4.d0(r12, r11) == r0) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x00f0  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x00a0 -> B:64:0x0054). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x00ed -> B:58:0x0023). Please submit an issue!!! */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            InterfaceC9181rA<Object> it;
            AI1 ai1;
            AI1 ai12;
            InterfaceC9181rA<Object> interfaceC9181rA;
            Object obj2;
            AI1 ai13;
            InterfaceC9181rA<Object> it2;
            AI1 ai14;
            InterfaceC9181rA<Object> interfaceC9181rA2;
            Object a;
            Object l = C7289jT0.l();
            int i = this.b1;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    interfaceC9181rA2 = (InterfaceC9181rA) this.Z0;
                                    ai14 = (AI1) this.c1;
                                    RT1.n(obj);
                                    it2 = interfaceC9181rA2;
                                    ai12 = ai14;
                                    this.c1 = ai12;
                                    this.Z0 = it2;
                                    this.b1 = 4;
                                    a = it2.a(this);
                                    if (a != l) {
                                        AI1 ai15 = ai12;
                                        interfaceC9181rA2 = it2;
                                        obj = a;
                                        ai14 = ai15;
                                        if (!((Boolean) obj).booleanValue()) {
                                            Object next = interfaceC9181rA2.next();
                                            this.c1 = ai14;
                                            this.Z0 = interfaceC9181rA2;
                                            this.b1 = 5;
                                        } else {
                                            return C7458kA2.a;
                                        }
                                    }
                                    return l;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC9181rA2 = (InterfaceC9181rA) this.Z0;
                            ai14 = (AI1) this.c1;
                            RT1.n(obj);
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        } else {
                            ai12 = (AI1) this.c1;
                            RT1.n(obj);
                            it2 = this.d1.iterator();
                            this.c1 = ai12;
                            this.Z0 = it2;
                            this.b1 = 4;
                            a = it2.a(this);
                            if (a != l) {
                            }
                            return l;
                        }
                    } else {
                        Object obj3 = this.a1;
                        ai13 = (AI1) this.c1;
                        RT1.n(obj);
                        interfaceC9181rA = (InterfaceC9181rA) this.Z0;
                        obj2 = obj3;
                        it = interfaceC9181rA;
                        if (((Boolean) obj).booleanValue()) {
                            this.c1 = ai13;
                            this.Z0 = null;
                            this.a1 = null;
                            this.b1 = 3;
                            if (ai13.d0(obj2, this) != l) {
                                ai12 = ai13;
                                it2 = this.d1.iterator();
                                this.c1 = ai12;
                                this.Z0 = it2;
                                this.b1 = 4;
                                a = it2.a(this);
                                if (a != l) {
                                }
                            }
                            return l;
                        }
                        ai1 = ai13;
                        this.c1 = ai1;
                        this.Z0 = it;
                        this.a1 = null;
                        this.b1 = 1;
                        obj = it.a(this);
                    }
                } else {
                    it = (InterfaceC9181rA) this.Z0;
                    ai1 = (AI1) this.c1;
                    RT1.n(obj);
                    AI1 ai16 = ai1;
                    InterfaceC9181rA<Object> interfaceC9181rA3 = it;
                    ai12 = ai16;
                    if (((Boolean) obj).booleanValue()) {
                        Object next2 = interfaceC9181rA3.next();
                        VA0<Object, HM<? super Boolean>, Object> va0 = this.e1;
                        this.c1 = ai12;
                        this.Z0 = interfaceC9181rA3;
                        this.a1 = next2;
                        this.b1 = 2;
                        Object i2 = va0.i(next2, this);
                        if (i2 != l) {
                            interfaceC9181rA = interfaceC9181rA3;
                            obj2 = next2;
                            obj = i2;
                            ai13 = ai12;
                            it = interfaceC9181rA;
                            if (((Boolean) obj).booleanValue()) {
                            }
                        }
                        return l;
                    }
                    it2 = this.d1.iterator();
                    this.c1 = ai12;
                    this.Z0 = it2;
                    this.b1 = 4;
                    a = it2.a(this);
                    if (a != l) {
                    }
                    return l;
                }
            } else {
                RT1.n(obj);
                it = this.d1.iterator();
                ai1 = (AI1) this.c1;
                this.c1 = ai1;
                this.Z0 = it;
                this.a1 = null;
                this.b1 = 1;
                obj = it.a(this);
            }
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(AI1<Object> ai1, HM<? super C7458kA2> hm) {
            return ((C2913g) t(ai1, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            C2913g c2913g = new C2913g(this.d1, this.e1, hm);
            c2913g.c1 = obj;
            return c2913g;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {68}, m = "elementAt", n = {"$this$consume$iv", "index", "count"}, s = {"L$0", "I$0", "I$1"})
    /* renamed from: o.FA$h */
    /* loaded from: classes3.dex */
    public static final class C2914h<E> extends KM {
        public int Y0;
        public int Z0;
        public Object a1;
        public Object b1;
        public /* synthetic */ Object c1;
        public int d1;

        public C2914h(HM<? super C2914h> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            Object t;
            this.c1 = obj;
            this.d1 |= Integer.MIN_VALUE;
            t = FA.t(null, 0, this);
            return t;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {83}, m = "elementAtOrNull", n = {"$this$consume$iv", "index", "count"}, s = {"L$0", "I$0", "I$1"})
    /* renamed from: o.FA$i */
    /* loaded from: classes3.dex */
    public static final class C2915i<E> extends KM {
        public int Y0;
        public int Z0;
        public Object a1;
        public Object b1;
        public /* synthetic */ Object c1;
        public int d1;

        public C2915i(HM<? super C2915i> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            Object u;
            this.c1 = obj;
            this.d1 |= Integer.MIN_VALUE;
            u = FA.u(null, 0, this);
            return u;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {228, 229, 229}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", W12.i, "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    /* renamed from: o.FA$j */
    /* loaded from: classes3.dex */
    public static final class C2916j<E> extends AbstractC4225Si2 implements VA0<AI1<? super E>, HM<? super C7458kA2>, Object> {
        public Object Z0;
        public Object a1;
        public int b1;
        public /* synthetic */ Object c1;
        public final /* synthetic */ OO1<E> d1;
        public final /* synthetic */ VA0<E, HM<? super Boolean>, Object> e1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2916j(OO1<? extends E> oo1, VA0<? super E, ? super HM<? super Boolean>, ? extends Object> va0, HM<? super C2916j> hm) {
            super(2, hm);
            this.d1 = oo1;
            this.e1 = va0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x005d, code lost:
            if (r10 == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
            if (r7.d0(r6, r9) == r0) goto L22;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0089  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0098 -> B:43:0x0051). Please submit an issue!!! */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            InterfaceC9181rA<E> it;
            AI1 ai1;
            AI1 ai12;
            E e;
            Object l = C7289jT0.l();
            int i = this.b1;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            it = (InterfaceC9181rA) this.Z0;
                            ai1 = (AI1) this.c1;
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Object obj2 = this.a1;
                        InterfaceC9181rA<E> interfaceC9181rA = (InterfaceC9181rA) this.Z0;
                        ai12 = (AI1) this.c1;
                        RT1.n(obj);
                        e = obj2;
                        it = interfaceC9181rA;
                        if (((Boolean) obj).booleanValue()) {
                            this.c1 = ai12;
                            this.Z0 = it;
                            this.a1 = null;
                            this.b1 = 3;
                        }
                        ai1 = ai12;
                    }
                } else {
                    it = (InterfaceC9181rA) this.Z0;
                    ai1 = (AI1) this.c1;
                    RT1.n(obj);
                    if (((Boolean) obj).booleanValue()) {
                        E next = it.next();
                        VA0<E, HM<? super Boolean>, Object> va0 = this.e1;
                        this.c1 = ai1;
                        this.Z0 = it;
                        this.a1 = next;
                        this.b1 = 2;
                        Object i2 = va0.i(next, this);
                        if (i2 != l) {
                            AI1 ai13 = ai1;
                            e = next;
                            obj = i2;
                            ai12 = ai13;
                            if (((Boolean) obj).booleanValue()) {
                            }
                            ai1 = ai12;
                        }
                        return l;
                    }
                    return C7458kA2.a;
                }
            } else {
                RT1.n(obj);
                it = this.d1.iterator();
                ai1 = (AI1) this.c1;
            }
            this.c1 = ai1;
            this.Z0 = it;
            this.a1 = null;
            this.b1 = 1;
            obj = it.a(this);
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(AI1<? super E> ai1, HM<? super C7458kA2> hm) {
            return ((C2916j) t(ai1, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            C2916j c2916j = new C2916j(this.d1, this.e1, hm);
            c2916j.c1 = obj;
            return c2916j;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {C10997yd1.o2, 242, 242}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", W12.i, "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
    /* renamed from: o.FA$k */
    /* loaded from: classes3.dex */
    public static final class C2917k extends AbstractC4225Si2 implements VA0<AI1<Object>, HM<? super C7458kA2>, Object> {
        public Object Z0;
        public Object a1;
        public int b1;
        public int c1;
        public /* synthetic */ Object d1;
        public final /* synthetic */ OO1<Object> e1;
        public final /* synthetic */ XA0<Integer, Object, HM<? super Boolean>, Object> f1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2917k(OO1<Object> oo1, XA0<? super Integer, Object, ? super HM<? super Boolean>, ? extends Object> xa0, HM<? super C2917k> hm) {
            super(2, hm);
            this.e1 = oo1;
            this.f1 = xa0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x0069, code lost:
            if (r12 == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00ab, code lost:
            if (r8.d0(r7, r11) == r0) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00ae -> B:43:0x005b). Please submit an issue!!! */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            InterfaceC9181rA<Object> it;
            int i;
            AI1 ai1;
            AI1 ai12;
            Object obj2;
            Object l = C7289jT0.l();
            int i2 = this.c1;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            i = this.b1;
                            it = (InterfaceC9181rA) this.Z0;
                            ai1 = (AI1) this.d1;
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        i = this.b1;
                        Object obj3 = this.a1;
                        InterfaceC9181rA<Object> interfaceC9181rA = (InterfaceC9181rA) this.Z0;
                        ai12 = (AI1) this.d1;
                        RT1.n(obj);
                        obj2 = obj3;
                        it = interfaceC9181rA;
                        if (((Boolean) obj).booleanValue()) {
                            this.d1 = ai12;
                            this.Z0 = it;
                            this.a1 = null;
                            this.b1 = i;
                            this.c1 = 3;
                        }
                        ai1 = ai12;
                    }
                } else {
                    i = this.b1;
                    it = (InterfaceC9181rA) this.Z0;
                    ai1 = (AI1) this.d1;
                    RT1.n(obj);
                    if (((Boolean) obj).booleanValue()) {
                        Object next = it.next();
                        XA0<Integer, Object, HM<? super Boolean>, Object> xa0 = this.f1;
                        int i3 = i + 1;
                        Integer f = C10557wp.f(i);
                        this.d1 = ai1;
                        this.Z0 = it;
                        this.a1 = next;
                        this.b1 = i3;
                        this.c1 = 2;
                        Object P = xa0.P(f, next, this);
                        if (P != l) {
                            ai12 = ai1;
                            obj2 = next;
                            obj = P;
                            i = i3;
                            if (((Boolean) obj).booleanValue()) {
                            }
                            ai1 = ai12;
                        }
                        return l;
                    }
                    return C7458kA2.a;
                }
            } else {
                RT1.n(obj);
                it = this.e1.iterator();
                i = 0;
                ai1 = (AI1) this.d1;
            }
            this.d1 = ai1;
            this.Z0 = it;
            this.a1 = null;
            this.b1 = i;
            this.c1 = 1;
            obj = it.a(this);
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(AI1<Object> ai1, HM<? super C7458kA2> hm) {
            return ((C2917k) t(ai1, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            C2917k c2917k = new C2917k(this.e1, this.f1, hm);
            c2917k.d1 = obj;
            return c2917k;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", f = "Deprecated.kt", i = {}, l = {252}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class l extends AbstractC4225Si2 implements VA0<Object, HM<? super Boolean>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ VA0<Object, HM<? super Boolean>, Object> b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(VA0<Object, ? super HM<? super Boolean>, ? extends Object> va0, HM<? super l> hm) {
            super(2, hm);
            this.b1 = va0;
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
                Object obj2 = this.a1;
                VA0<Object, HM<? super Boolean>, Object> va0 = this.b1;
                this.Z0 = 1;
                obj = va0.i(obj2, this);
                if (obj == l) {
                    return l;
                }
            }
            return C10557wp.a(!((Boolean) obj).booleanValue());
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(Object obj, HM<? super Boolean> hm) {
            return ((l) t(obj, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            l lVar = new l(this.b1, hm);
            lVar.a1 = obj;
            return lVar;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class m<E> extends AbstractC4225Si2 implements VA0<E, HM<? super Boolean>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;

        public m(HM<? super m> hm) {
            super(2, hm);
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            boolean z;
            C7289jT0.l();
            if (this.Z0 == 0) {
                RT1.n(obj);
                if (this.a1 != null) {
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
        public final Object i(E e, HM<? super Boolean> hm) {
            return ((m) t(e, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            m mVar = new m(hm);
            mVar.a1 = obj;
            return mVar;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {514}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class n<E, C extends Collection<? super E>> extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public /* synthetic */ Object b1;
        public int c1;

        public n(HM<? super n> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            Object C;
            this.b1 = obj;
            this.c1 |= Integer.MIN_VALUE;
            C = FA.C(null, null, this);
            return C;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {514, 272}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class o<E, C extends InterfaceC10362w02<? super E>> extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public /* synthetic */ Object b1;
        public int c1;

        public o(HM<? super o> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            Object D;
            this.b1 = obj;
            this.c1 |= Integer.MIN_VALUE;
            D = FA.D(null, null, this);
            return D;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {95}, m = "first", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class p<E> extends KM {
        public Object Y0;
        public Object Z0;
        public /* synthetic */ Object a1;
        public int b1;

        public p(HM<? super p> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            Object E;
            this.a1 = obj;
            this.b1 |= Integer.MIN_VALUE;
            E = FA.E(null, this);
            return E;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {105}, m = "firstOrNull", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class q<E> extends KM {
        public Object Y0;
        public Object Z0;
        public /* synthetic */ Object a1;
        public int b1;

        public q(HM<? super q> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            Object F;
            this.a1 = obj;
            this.b1 |= Integer.MIN_VALUE;
            F = FA.F(null, this);
            return F;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", i = {0, 1, 2}, l = {351, 352, 352}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    /* loaded from: classes3.dex */
    public static final class r extends AbstractC4225Si2 implements VA0<AI1<Object>, HM<? super C7458kA2>, Object> {
        public Object Z0;
        public int a1;
        public /* synthetic */ Object b1;
        public final /* synthetic */ OO1<Object> c1;
        public final /* synthetic */ VA0<Object, HM<? super OO1<Object>>, Object> d1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(OO1<Object> oo1, VA0<Object, ? super HM<? super OO1<Object>>, ? extends Object> va0, HM<? super r> hm) {
            super(2, hm);
            this.c1 = oo1;
            this.d1 = va0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x0055, code lost:
            if (r8 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0070, code lost:
            if (r8 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x007f, code lost:
            if (o.C11128zA.e0((o.OO1) r8, r5, r7) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0081, code lost:
            return r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x007f -> B:39:0x004b). Please submit an issue!!! */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            InterfaceC9181rA<Object> it;
            AI1 ai1;
            Object l = C7289jT0.l();
            int i = this.a1;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            it = (InterfaceC9181rA) this.Z0;
                            ai1 = (AI1) this.b1;
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        it = (InterfaceC9181rA) this.Z0;
                        ai1 = (AI1) this.b1;
                        RT1.n(obj);
                        this.b1 = ai1;
                        this.Z0 = it;
                        this.a1 = 3;
                    }
                } else {
                    it = (InterfaceC9181rA) this.Z0;
                    ai1 = (AI1) this.b1;
                    RT1.n(obj);
                    if (((Boolean) obj).booleanValue()) {
                        Object next = it.next();
                        VA0<Object, HM<? super OO1<Object>>, Object> va0 = this.d1;
                        this.b1 = ai1;
                        this.Z0 = it;
                        this.a1 = 2;
                        obj = va0.i(next, this);
                    } else {
                        return C7458kA2.a;
                    }
                }
            } else {
                RT1.n(obj);
                it = this.c1.iterator();
                ai1 = (AI1) this.b1;
            }
            this.b1 = ai1;
            this.Z0 = it;
            this.a1 = 1;
            obj = it.a(this);
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(AI1<Object> ai1, HM<? super C7458kA2> hm) {
            return ((r) t(ai1, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            r rVar = new r(this.c1, this.d1, hm);
            rVar.b1 = obj;
            return rVar;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {514}, m = "indexOf", n = {"element", "index", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2"})
    /* loaded from: classes3.dex */
    public static final class s<E> extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public Object b1;
        public /* synthetic */ Object c1;
        public int d1;

        public s(HM<? super s> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            Object I;
            this.c1 = obj;
            this.d1 |= Integer.MIN_VALUE;
            I = FA.I(null, null, this);
            return I;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {127, 130}, m = "last", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    /* loaded from: classes3.dex */
    public static final class t<E> extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public /* synthetic */ Object b1;
        public int c1;

        public t(HM<? super t> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            Object J;
            this.b1 = obj;
            this.c1 |= Integer.MIN_VALUE;
            J = FA.J(null, this);
            return J;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 0}, l = {514}, m = "lastIndexOf", n = {"element", "lastIndex", "index", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    /* loaded from: classes3.dex */
    public static final class u<E> extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public Object b1;
        public Object c1;
        public /* synthetic */ Object d1;
        public int e1;

        public u(HM<? super u> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            Object K;
            this.d1 = obj;
            this.e1 |= Integer.MIN_VALUE;
            K = FA.K(null, null, this);
            return K;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {C3503Kz.m0, C3503Kz.p0}, m = "lastOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    /* loaded from: classes3.dex */
    public static final class v<E> extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public /* synthetic */ Object b1;
        public int c1;

        public v(HM<? super v> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            Object L;
            this.b1 = obj;
            this.c1 |= Integer.MIN_VALUE;
            L = FA.L(null, this);
            return L;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {514, 363, 363}, m = "invokeSuspend", n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
    @InterfaceC8303na2({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$map$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,509:1\n160#2:510\n94#2,3:511\n161#2,2:514\n101#2:516\n97#2,3:517\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$map$1\n*L\n362#1:510\n362#1:511,3\n362#1:514,2\n362#1:516\n362#1:517,3\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class w<R> extends AbstractC4225Si2 implements VA0<AI1<? super R>, HM<? super C7458kA2>, Object> {
        public Object Z0;
        public Object a1;
        public Object b1;
        public Object c1;
        public int d1;
        public /* synthetic */ Object e1;
        public final /* synthetic */ OO1<E> f1;
        public final /* synthetic */ VA0<E, HM<? super R>, Object> g1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public w(OO1<? extends E> oo1, VA0<? super E, ? super HM<? super R>, ? extends Object> va0, HM<? super w> hm) {
            super(2, hm);
            this.f1 = oo1;
            this.g1 = va0;
        }

        /* JADX WARN: Removed duplicated region for block: B:81:0x0091 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:59:0x0022, B:75:0x0075, B:79:0x0089, B:81:0x0091, B:89:0x00c5, B:71:0x005f, B:74:0x006e), top: B:96:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00c5 A[Catch: all -> 0x0027, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:59:0x0022, B:75:0x0075, B:79:0x0089, B:81:0x0091, B:89:0x00c5, B:71:0x005f, B:74:0x006e), top: B:96:0x000a }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x00c0 -> B:75:0x0075). Please submit an issue!!! */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            OO1 oo1;
            AI1 ai1;
            VA0 va0;
            InterfaceC9181rA it;
            OO1 oo12;
            AI1 ai12;
            VA0 va02;
            InterfaceC9181rA interfaceC9181rA;
            AI1 ai13;
            AI1 ai14;
            Object l = C7289jT0.l();
            int i = this.d1;
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                it = (InterfaceC9181rA) this.b1;
                                oo1 = (OO1) this.a1;
                                va0 = (VA0) this.Z0;
                                AI1 ai15 = (AI1) this.e1;
                                RT1.n(obj);
                                ai1 = ai15;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ai13 = (AI1) this.c1;
                            interfaceC9181rA = (InterfaceC9181rA) this.b1;
                            oo12 = (OO1) this.a1;
                            va02 = (VA0) this.Z0;
                            ai12 = (AI1) this.e1;
                            try {
                                RT1.n(obj);
                                this.e1 = ai12;
                                this.Z0 = va02;
                                this.a1 = oo12;
                                this.b1 = interfaceC9181rA;
                                this.c1 = null;
                                this.d1 = 3;
                                if (ai13.d0(obj, this) != l) {
                                    it = interfaceC9181rA;
                                    oo1 = oo12;
                                    va0 = va02;
                                    ai1 = ai12;
                                }
                                return l;
                            } catch (Throwable th) {
                                th = th;
                                oo1 = oo12;
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    C11128zA.b(oo1, th);
                                    throw th2;
                                }
                            }
                        }
                    } else {
                        it = (InterfaceC9181rA) this.b1;
                        oo1 = (OO1) this.a1;
                        va0 = (VA0) this.Z0;
                        ai14 = (AI1) this.e1;
                        RT1.n(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            Object next = it.next();
                            this.e1 = ai14;
                            this.Z0 = va0;
                            this.a1 = oo1;
                            this.b1 = it;
                            this.c1 = ai14;
                            this.d1 = 2;
                            obj = va0.i(next, this);
                            if (obj != l) {
                                ai12 = ai14;
                                va02 = va0;
                                oo12 = oo1;
                                interfaceC9181rA = it;
                                ai13 = ai12;
                                this.e1 = ai12;
                                this.Z0 = va02;
                                this.a1 = oo12;
                                this.b1 = interfaceC9181rA;
                                this.c1 = null;
                                this.d1 = 3;
                                if (ai13.d0(obj, this) != l) {
                                }
                            }
                            return l;
                        }
                        C7458kA2 c7458kA2 = C7458kA2.a;
                        C11128zA.b(oo1, null);
                        return c7458kA2;
                    }
                } else {
                    RT1.n(obj);
                    ai1 = (AI1) this.e1;
                    oo1 = this.f1;
                    va0 = this.g1;
                    it = oo1.iterator();
                }
                this.e1 = ai1;
                this.Z0 = va0;
                this.a1 = oo1;
                this.b1 = it;
                this.d1 = 1;
                Object a = it.a(this);
                if (a != l) {
                    ai14 = ai1;
                    obj = a;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                } else {
                    return l;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(AI1<? super R> ai1, HM<? super C7458kA2> hm) {
            return ((w) t(ai1, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            w wVar = new w(this.f1, this.g1, hm);
            wVar.e1 = obj;
            return wVar;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {374, 375, 375}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
    /* loaded from: classes3.dex */
    public static final class x<R> extends AbstractC4225Si2 implements VA0<AI1<? super R>, HM<? super C7458kA2>, Object> {
        public Object Z0;
        public Object a1;
        public int b1;
        public int c1;
        public /* synthetic */ Object d1;
        public final /* synthetic */ OO1<E> e1;
        public final /* synthetic */ XA0<Integer, E, HM<? super R>, Object> f1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public x(OO1<? extends E> oo1, XA0<? super Integer, ? super E, ? super HM<? super R>, ? extends Object> xa0, HM<? super x> hm) {
            super(2, hm);
            this.e1 = oo1;
            this.f1 = xa0;
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00a6 -> B:42:0x0059). Please submit an issue!!! */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            AI1 ai1;
            InterfaceC9181rA it;
            int i;
            AI1 ai12;
            InterfaceC9181rA interfaceC9181rA;
            AI1 ai13;
            AI1 ai14;
            Object l = C7289jT0.l();
            int i2 = this.c1;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            i = this.b1;
                            it = (InterfaceC9181rA) this.Z0;
                            RT1.n(obj);
                            ai1 = (AI1) this.d1;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        i = this.b1;
                        ai13 = (AI1) this.a1;
                        interfaceC9181rA = (InterfaceC9181rA) this.Z0;
                        ai12 = (AI1) this.d1;
                        RT1.n(obj);
                        this.d1 = ai12;
                        this.Z0 = interfaceC9181rA;
                        this.a1 = null;
                        this.b1 = i;
                        this.c1 = 3;
                        if (ai13.d0(obj, this) != l) {
                            it = interfaceC9181rA;
                            ai1 = ai12;
                        }
                        return l;
                    }
                } else {
                    i = this.b1;
                    it = (InterfaceC9181rA) this.Z0;
                    ai14 = (AI1) this.d1;
                    RT1.n(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        Object next = it.next();
                        XA0<Integer, E, HM<? super R>, Object> xa0 = this.f1;
                        int i3 = i + 1;
                        Integer f = C10557wp.f(i);
                        this.d1 = ai14;
                        this.Z0 = it;
                        this.a1 = ai14;
                        this.b1 = i3;
                        this.c1 = 2;
                        obj = xa0.P(f, next, this);
                        if (obj != l) {
                            ai12 = ai14;
                            i = i3;
                            interfaceC9181rA = it;
                            ai13 = ai12;
                            this.d1 = ai12;
                            this.Z0 = interfaceC9181rA;
                            this.a1 = null;
                            this.b1 = i;
                            this.c1 = 3;
                            if (ai13.d0(obj, this) != l) {
                            }
                        }
                        return l;
                    }
                    return C7458kA2.a;
                }
            } else {
                RT1.n(obj);
                ai1 = (AI1) this.d1;
                it = this.e1.iterator();
                i = 0;
            }
            this.d1 = ai1;
            this.Z0 = it;
            this.b1 = i;
            this.c1 = 1;
            Object a = it.a(this);
            if (a != l) {
                ai14 = ai1;
                obj = a;
                if (!((Boolean) obj).booleanValue()) {
                }
            }
            return l;
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(AI1<? super R> ai1, HM<? super C7458kA2> hm) {
            return ((x) t(ai1, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            x xVar = new x(this.e1, this.f1, hm);
            xVar.d1 = obj;
            return xVar;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {450, 452}, m = "maxWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "max"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    /* loaded from: classes3.dex */
    public static final class y<E> extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public Object b1;
        public /* synthetic */ Object c1;
        public int d1;

        public y(HM<? super y> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            Object U;
            this.c1 = obj;
            this.d1 |= Integer.MIN_VALUE;
            U = FA.U(null, null, this);
            return U;
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {464, 466}, m = "minWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "min"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    /* loaded from: classes3.dex */
    public static final class z<E> extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public Object b1;
        public /* synthetic */ Object c1;
        public int d1;

        public z(HM<? super z> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            Object V;
            this.c1 = obj;
            this.d1 |= Integer.MIN_VALUE;
            V = FA.V(null, null, this);
            return V;
        }
    }

    public static /* synthetic */ OO1 A(OO1 oo1, InterfaceC5809dQ interfaceC5809dQ, VA0 va0, int i, Object obj) {
        OO1 z2;
        if ((i & 1) != 0) {
            interfaceC5809dQ = C8909q40.g();
        }
        z2 = z(oo1, interfaceC5809dQ, va0);
        return z2;
    }

    @HK1
    @NotNull
    public static final <E> OO1<E> B(@NotNull OO1<? extends E> oo1) {
        OO1<E> w2;
        w2 = w(oo1, null, new m(null), 1, null);
        C6562gT0.n(w2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNull>");
        return w2;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0064 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:58:0x0031, B:71:0x005c, B:73:0x0064, B:75:0x006a, B:67:0x004a, B:77:0x006f), top: B:86:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x006f A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:58:0x0031, B:71:0x005c, B:73:0x0064, B:75:0x006a, B:67:0x004a, B:77:0x006f), top: B:86:0x0031 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0059 -> B:71:0x005c). Please submit an issue!!! */
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object C(OO1 oo1, Collection collection, HM hm) {
        n nVar;
        int i;
        OO1 oo12;
        Throwable th;
        InterfaceC9181rA it;
        Collection collection2;
        Object a;
        if (hm instanceof n) {
            nVar = (n) hm;
            int i2 = nVar.c1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.c1 = i2 - Integer.MIN_VALUE;
                Object obj = nVar.b1;
                Object l2 = C7289jT0.l();
                i = nVar.c1;
                if (i == 0) {
                    if (i == 1) {
                        it = (InterfaceC9181rA) nVar.a1;
                        oo12 = (OO1) nVar.Z0;
                        Collection collection3 = (Collection) nVar.Y0;
                        try {
                            RT1.n(obj);
                            if (((Boolean) obj).booleanValue()) {
                                Object next = it.next();
                                if (next != null) {
                                    collection3.add(next);
                                }
                                collection2 = collection3;
                                nVar.Y0 = collection2;
                                nVar.Z0 = oo12;
                                nVar.a1 = it;
                                nVar.c1 = 1;
                                a = it.a(nVar);
                                if (a != l2) {
                                    return l2;
                                }
                                collection3 = collection2;
                                obj = a;
                                if (((Boolean) obj).booleanValue()) {
                                }
                            } else {
                                C7458kA2 c7458kA2 = C7458kA2.a;
                                C11128zA.b(oo12, null);
                                return collection3;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                C11128zA.b(oo12, th);
                                throw th3;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    try {
                        oo12 = oo1;
                        it = oo1.iterator();
                        collection2 = collection;
                        nVar.Y0 = collection2;
                        nVar.Z0 = oo12;
                        nVar.a1 = it;
                        nVar.c1 = 1;
                        a = it.a(nVar);
                        if (a != l2) {
                        }
                    } catch (Throwable th4) {
                        oo12 = oo1;
                        th = th4;
                        throw th;
                    }
                }
            }
        }
        nVar = new n(hm);
        Object obj2 = nVar.b1;
        Object l22 = C7289jT0.l();
        i = nVar.c1;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0088, code lost:
        if (r2.d0(r8, r0) == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0076 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:64:0x0034, B:79:0x006e, B:81:0x0076, B:83:0x007c, B:87:0x008f, B:71:0x004f), top: B:98:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x008f A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #1 {all -> 0x0038, blocks: (B:64:0x0034, B:79:0x006e, B:81:0x0076, B:83:0x007c, B:87:0x008f, B:71:0x004f), top: B:98:0x0022 }] */
    /* JADX WARN: Type inference failed for: r7v0, types: [o.w02] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [o.OO1] */
    /* JADX WARN: Type inference failed for: r7v5, types: [o.OO1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x007a -> B:86:0x008b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0088 -> B:86:0x008b). Please submit an issue!!! */
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object D(OO1 oo1, InterfaceC10362w02 interfaceC10362w02, HM hm) {
        o oVar;
        int i;
        InterfaceC9181rA it;
        InterfaceC9181rA interfaceC9181rA;
        InterfaceC10362w02 interfaceC10362w022;
        InterfaceC10362w02 interfaceC10362w023;
        Object a;
        try {
            if (hm instanceof o) {
                oVar = (o) hm;
                int i2 = oVar.c1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    oVar.c1 = i2 - Integer.MIN_VALUE;
                    Object obj = oVar.b1;
                    Object l2 = C7289jT0.l();
                    i = oVar.c1;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                interfaceC9181rA = (InterfaceC9181rA) oVar.a1;
                                OO1 oo12 = (OO1) oVar.Z0;
                                interfaceC10362w022 = (InterfaceC10362w02) oVar.Y0;
                                RT1.n(obj);
                                OO1 oo13 = oo12;
                                it = interfaceC9181rA;
                                oo1 = oo13;
                                interfaceC10362w023 = interfaceC10362w022;
                                oVar.Y0 = interfaceC10362w023;
                                oVar.Z0 = oo1;
                                oVar.a1 = it;
                                oVar.c1 = 1;
                                a = it.a(oVar);
                                if (a != l2) {
                                    InterfaceC10362w02 interfaceC10362w024 = interfaceC10362w023;
                                    interfaceC10362w02 = oo1;
                                    interfaceC9181rA = it;
                                    obj = a;
                                    interfaceC10362w022 = interfaceC10362w024;
                                    if (!((Boolean) obj).booleanValue()) {
                                        Object next = interfaceC9181rA.next();
                                        oo13 = interfaceC10362w02;
                                        if (next != null) {
                                            oVar.Y0 = interfaceC10362w022;
                                            oVar.Z0 = interfaceC10362w02;
                                            oVar.a1 = interfaceC9181rA;
                                            oVar.c1 = 2;
                                            oo13 = interfaceC10362w02;
                                        }
                                        it = interfaceC9181rA;
                                        oo1 = oo13;
                                        interfaceC10362w023 = interfaceC10362w022;
                                        oVar.Y0 = interfaceC10362w023;
                                        oVar.Z0 = oo1;
                                        oVar.a1 = it;
                                        oVar.c1 = 1;
                                        a = it.a(oVar);
                                        if (a != l2) {
                                        }
                                    } else {
                                        C7458kA2 c7458kA2 = C7458kA2.a;
                                        C11128zA.b(interfaceC10362w02, null);
                                        return interfaceC10362w022;
                                    }
                                }
                                return l2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC9181rA = (InterfaceC9181rA) oVar.a1;
                        OO1 oo14 = (OO1) oVar.Z0;
                        interfaceC10362w022 = (InterfaceC10362w02) oVar.Y0;
                        RT1.n(obj);
                        interfaceC10362w02 = oo14;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        RT1.n(obj);
                        try {
                            it = oo1.iterator();
                            interfaceC10362w023 = interfaceC10362w02;
                            oVar.Y0 = interfaceC10362w023;
                            oVar.Z0 = oo1;
                            oVar.a1 = it;
                            oVar.c1 = 1;
                            a = it.a(oVar);
                            if (a != l2) {
                            }
                            return l2;
                        } catch (Throwable th) {
                            interfaceC10362w02 = oo1;
                            th = th;
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                C11128zA.b(interfaceC10362w02, th);
                                throw th2;
                            }
                        }
                    }
                }
            }
            if (i == 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        oVar = new o(hm);
        Object obj2 = oVar.b1;
        Object l22 = C7289jT0.l();
        i = oVar.c1;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005b A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #1 {all -> 0x0031, blocks: (B:53:0x002d, B:64:0x0053, B:66:0x005b, B:69:0x0064, B:70:0x006b), top: B:79:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0064 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #1 {all -> 0x0031, blocks: (B:53:0x002d, B:64:0x0053, B:66:0x005b, B:69:0x0064, B:70:0x006b), top: B:79:0x002d }] */
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object E(OO1 oo1, HM hm) {
        p pVar;
        Object obj;
        int i;
        OO1 oo12;
        Throwable th;
        InterfaceC9181rA interfaceC9181rA;
        if (hm instanceof p) {
            pVar = (p) hm;
            int i2 = pVar.b1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.b1 = i2 - Integer.MIN_VALUE;
                obj = pVar.a1;
                Object l2 = C7289jT0.l();
                i = pVar.b1;
                if (i == 0) {
                    if (i == 1) {
                        interfaceC9181rA = (InterfaceC9181rA) pVar.Z0;
                        oo12 = (OO1) pVar.Y0;
                        try {
                            RT1.n(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                C11128zA.b(oo12, th);
                                throw th3;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    try {
                        InterfaceC9181rA it = oo1.iterator();
                        pVar.Y0 = oo1;
                        pVar.Z0 = it;
                        pVar.b1 = 1;
                        Object a = it.a(pVar);
                        if (a == l2) {
                            return l2;
                        }
                        oo12 = oo1;
                        interfaceC9181rA = it;
                        obj = a;
                    } catch (Throwable th4) {
                        oo12 = oo1;
                        th = th4;
                        throw th;
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    Object next = interfaceC9181rA.next();
                    C11128zA.b(oo12, null);
                    return next;
                }
                throw new NoSuchElementException("ReceiveChannel is empty.");
            }
        }
        pVar = new p(hm);
        obj = pVar.a1;
        Object l22 = C7289jT0.l();
        i = pVar.b1;
        if (i == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0060 A[Catch: all -> 0x0031, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:55:0x002d, B:66:0x0053, B:71:0x0060), top: B:80:0x002d }] */
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object F(OO1 oo1, HM hm) {
        q qVar;
        Object obj;
        int i;
        OO1 oo12;
        Throwable th;
        InterfaceC9181rA interfaceC9181rA;
        if (hm instanceof q) {
            qVar = (q) hm;
            int i2 = qVar.b1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.b1 = i2 - Integer.MIN_VALUE;
                obj = qVar.a1;
                Object l2 = C7289jT0.l();
                i = qVar.b1;
                if (i == 0) {
                    if (i == 1) {
                        interfaceC9181rA = (InterfaceC9181rA) qVar.Z0;
                        oo12 = (OO1) qVar.Y0;
                        try {
                            RT1.n(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                C11128zA.b(oo12, th);
                                throw th3;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    try {
                        InterfaceC9181rA it = oo1.iterator();
                        qVar.Y0 = oo1;
                        qVar.Z0 = it;
                        qVar.b1 = 1;
                        Object a = it.a(qVar);
                        if (a == l2) {
                            return l2;
                        }
                        oo12 = oo1;
                        interfaceC9181rA = it;
                        obj = a;
                    } catch (Throwable th4) {
                        oo12 = oo1;
                        th = th4;
                        throw th;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    C11128zA.b(oo12, null);
                    return null;
                }
                Object next = interfaceC9181rA.next();
                C11128zA.b(oo12, null);
                return next;
            }
        }
        qVar = new q(hm);
        obj = qVar.a1;
        Object l22 = C7289jT0.l();
        i = qVar.b1;
        if (i == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    public static final /* synthetic */ OO1 G(OO1 oo1, InterfaceC5809dQ interfaceC5809dQ, VA0 va0) {
        return C10919yI1.i(C6502gE0.X, interfaceC5809dQ, 0, null, C11128zA.g(oo1), new r(oo1, va0, null), 6, null);
    }

    public static /* synthetic */ OO1 H(OO1 oo1, InterfaceC5809dQ interfaceC5809dQ, VA0 va0, int i, Object obj) {
        OO1 G2;
        if ((i & 1) != 0) {
            interfaceC5809dQ = C8909q40.g();
        }
        G2 = G(oo1, interfaceC5809dQ, va0);
        return G2;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0070 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:59:0x0033, B:72:0x0067, B:74:0x0070, B:76:0x007a, B:79:0x0084, B:68:0x0053, B:80:0x008b), top: B:91:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x008b A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:59:0x0033, B:72:0x0067, B:74:0x0070, B:76:0x007a, B:79:0x0084, B:68:0x0053, B:80:0x008b), top: B:91:0x0033 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0064 -> B:72:0x0067). Please submit an issue!!! */
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object I(OO1 oo1, Object obj, HM hm) {
        s sVar;
        int i;
        OO1 oo12;
        Throwable th;
        InterfaceC9181rA it;
        RP1.f fVar;
        Object obj2;
        Object a;
        try {
            if (hm instanceof s) {
                sVar = (s) hm;
                int i2 = sVar.d1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    sVar.d1 = i2 - Integer.MIN_VALUE;
                    Object obj3 = sVar.c1;
                    Object l2 = C7289jT0.l();
                    i = sVar.d1;
                    if (i == 0) {
                        if (i == 1) {
                            it = (InterfaceC9181rA) sVar.b1;
                            oo12 = (OO1) sVar.a1;
                            fVar = (RP1.f) sVar.Z0;
                            Object obj4 = sVar.Y0;
                            try {
                                RT1.n(obj3);
                                if (((Boolean) obj3).booleanValue()) {
                                    if (C6562gT0.g(obj4, it.next())) {
                                        Integer f = C10557wp.f(fVar.X);
                                        C11128zA.b(oo12, null);
                                        return f;
                                    }
                                    fVar.X++;
                                    obj2 = obj4;
                                    sVar.Y0 = obj2;
                                    sVar.Z0 = fVar;
                                    sVar.a1 = oo12;
                                    sVar.b1 = it;
                                    sVar.d1 = 1;
                                    a = it.a(sVar);
                                    if (a != l2) {
                                        return l2;
                                    }
                                    obj4 = obj2;
                                    obj3 = a;
                                    if (((Boolean) obj3).booleanValue()) {
                                    }
                                } else {
                                    C7458kA2 c7458kA2 = C7458kA2.a;
                                    C11128zA.b(oo12, null);
                                    return C10557wp.f(-1);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj3);
                        RP1.f fVar2 = new RP1.f();
                        try {
                            oo12 = oo1;
                            it = oo1.iterator();
                            fVar = fVar2;
                            obj2 = obj;
                            sVar.Y0 = obj2;
                            sVar.Z0 = fVar;
                            sVar.a1 = oo12;
                            sVar.b1 = it;
                            sVar.d1 = 1;
                            a = it.a(sVar);
                            if (a != l2) {
                            }
                        } catch (Throwable th3) {
                            oo12 = oo1;
                            th = th3;
                        }
                    }
                    throw th;
                }
            }
            throw th;
        } catch (Throwable th4) {
            C11128zA.b(oo12, th);
            throw th4;
        }
        sVar = new s(hm);
        Object obj32 = sVar.c1;
        Object l22 = C7289jT0.l();
        i = sVar.d1;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00a2 A[Catch: all -> 0x004e, TRY_ENTER, TryCatch #2 {all -> 0x004e, blocks: (B:78:0x004a, B:87:0x0069, B:89:0x0071, B:103:0x00a2, B:104:0x00a9), top: B:113:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0071 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #2 {all -> 0x004e, blocks: (B:78:0x004a, B:87:0x0069, B:89:0x0071, B:103:0x00a2, B:104:0x00a9), top: B:113:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0093 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:71:0x0032, B:95:0x008b, B:97:0x0093), top: B:109:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0099  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x0087 -> B:95:0x008b). Please submit an issue!!! */
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object J(OO1 oo1, HM hm) {
        t tVar;
        Object obj;
        int i;
        OO1 oo12;
        InterfaceC9181rA interfaceC9181rA;
        Object next;
        InterfaceC9181rA interfaceC9181rA2;
        Object a;
        if (hm instanceof t) {
            tVar = (t) hm;
            int i2 = tVar.c1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tVar.c1 = i2 - Integer.MIN_VALUE;
                obj = tVar.b1;
                Object l2 = C7289jT0.l();
                i = tVar.c1;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            Object obj2 = tVar.a1;
                            interfaceC9181rA2 = (InterfaceC9181rA) tVar.Z0;
                            OO1 oo13 = (OO1) tVar.Y0;
                            try {
                                RT1.n(obj);
                                if (!((Boolean) obj).booleanValue()) {
                                    next = interfaceC9181rA2.next();
                                    oo1 = oo13;
                                    tVar.Y0 = oo1;
                                    tVar.Z0 = interfaceC9181rA2;
                                    tVar.a1 = next;
                                    tVar.c1 = 2;
                                    a = interfaceC9181rA2.a(tVar);
                                    if (a != l2) {
                                        oo13 = oo1;
                                        obj2 = next;
                                        obj = a;
                                        if (!((Boolean) obj).booleanValue()) {
                                            C11128zA.b(oo13, null);
                                            return obj2;
                                        }
                                    }
                                    return l2;
                                }
                            } catch (Throwable th) {
                                th = th;
                                oo12 = oo13;
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    C11128zA.b(oo12, th);
                                    throw th2;
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        interfaceC9181rA = (InterfaceC9181rA) tVar.Z0;
                        oo12 = (OO1) tVar.Y0;
                        try {
                            RT1.n(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                        }
                    }
                } else {
                    RT1.n(obj);
                    try {
                        InterfaceC9181rA it = oo1.iterator();
                        tVar.Y0 = oo1;
                        tVar.Z0 = it;
                        tVar.c1 = 1;
                        Object a2 = it.a(tVar);
                        if (a2 != l2) {
                            oo12 = oo1;
                            interfaceC9181rA = it;
                            obj = a2;
                        }
                        return l2;
                    } catch (Throwable th4) {
                        oo12 = oo1;
                        th = th4;
                        throw th;
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    next = interfaceC9181rA.next();
                    OO1 oo14 = oo12;
                    interfaceC9181rA2 = interfaceC9181rA;
                    oo1 = oo14;
                    tVar.Y0 = oo1;
                    tVar.Z0 = interfaceC9181rA2;
                    tVar.a1 = next;
                    tVar.c1 = 2;
                    a = interfaceC9181rA2.a(tVar);
                    if (a != l2) {
                    }
                    return l2;
                }
                throw new NoSuchElementException("ReceiveChannel is empty.");
            }
        }
        tVar = new t(hm);
        obj = tVar.b1;
        Object l22 = C7289jT0.l();
        i = tVar.c1;
        if (i == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x007d A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:58:0x0037, B:71:0x0075, B:73:0x007d, B:75:0x0087, B:76:0x008b, B:67:0x005f, B:77:0x0092), top: B:88:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0092 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:58:0x0037, B:71:0x0075, B:73:0x007d, B:75:0x0087, B:76:0x008b, B:67:0x005f, B:77:0x0092), top: B:88:0x0037 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0072 -> B:71:0x0075). Please submit an issue!!! */
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object K(OO1 oo1, Object obj, HM hm) {
        u uVar;
        int i;
        RP1.f fVar;
        OO1 oo12;
        Throwable th;
        InterfaceC9181rA it;
        RP1.f fVar2;
        Object obj2;
        Object a;
        if (hm instanceof u) {
            uVar = (u) hm;
            int i2 = uVar.e1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uVar.e1 = i2 - Integer.MIN_VALUE;
                Object obj3 = uVar.d1;
                Object l2 = C7289jT0.l();
                i = uVar.e1;
                if (i == 0) {
                    if (i == 1) {
                        it = (InterfaceC9181rA) uVar.c1;
                        oo12 = (OO1) uVar.b1;
                        fVar = (RP1.f) uVar.a1;
                        fVar2 = (RP1.f) uVar.Z0;
                        Object obj4 = uVar.Y0;
                        try {
                            RT1.n(obj3);
                            if (((Boolean) obj3).booleanValue()) {
                                if (C6562gT0.g(obj4, it.next())) {
                                    fVar2.X = fVar.X;
                                }
                                fVar.X++;
                                obj2 = obj4;
                                uVar.Y0 = obj2;
                                uVar.Z0 = fVar2;
                                uVar.a1 = fVar;
                                uVar.b1 = oo12;
                                uVar.c1 = it;
                                uVar.e1 = 1;
                                a = it.a(uVar);
                                if (a != l2) {
                                    return l2;
                                }
                                obj4 = obj2;
                                obj3 = a;
                                if (((Boolean) obj3).booleanValue()) {
                                }
                            } else {
                                C7458kA2 c7458kA2 = C7458kA2.a;
                                C11128zA.b(oo12, null);
                                return C10557wp.f(fVar2.X);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                C11128zA.b(oo12, th);
                                throw th3;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj3);
                    RP1.f fVar3 = new RP1.f();
                    fVar3.X = -1;
                    fVar = new RP1.f();
                    try {
                        oo12 = oo1;
                        it = oo1.iterator();
                        fVar2 = fVar3;
                        obj2 = obj;
                        uVar.Y0 = obj2;
                        uVar.Z0 = fVar2;
                        uVar.a1 = fVar;
                        uVar.b1 = oo12;
                        uVar.c1 = it;
                        uVar.e1 = 1;
                        a = it.a(uVar);
                        if (a != l2) {
                        }
                    } catch (Throwable th4) {
                        oo12 = oo1;
                        th = th4;
                        throw th;
                    }
                }
            }
        }
        uVar = new u(hm);
        Object obj32 = uVar.d1;
        Object l22 = C7289jT0.l();
        i = uVar.e1;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0097 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #2 {all -> 0x0037, blocks: (B:72:0x0033, B:98:0x008f, B:100:0x0097), top: B:114:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0075 A[Catch: all -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x004f, blocks: (B:79:0x004b, B:88:0x0069, B:92:0x0075), top: B:116:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x008b -> B:98:0x008f). Please submit an issue!!! */
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object L(OO1 oo1, HM hm) {
        v vVar;
        Object obj;
        int i;
        OO1 oo12;
        InterfaceC9181rA interfaceC9181rA;
        Object next;
        InterfaceC9181rA interfaceC9181rA2;
        Object a;
        if (hm instanceof v) {
            vVar = (v) hm;
            int i2 = vVar.c1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.c1 = i2 - Integer.MIN_VALUE;
                obj = vVar.b1;
                Object l2 = C7289jT0.l();
                i = vVar.c1;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            Object obj2 = vVar.a1;
                            interfaceC9181rA2 = (InterfaceC9181rA) vVar.Z0;
                            OO1 oo13 = (OO1) vVar.Y0;
                            try {
                                RT1.n(obj);
                                if (!((Boolean) obj).booleanValue()) {
                                    next = interfaceC9181rA2.next();
                                    oo1 = oo13;
                                    vVar.Y0 = oo1;
                                    vVar.Z0 = interfaceC9181rA2;
                                    vVar.a1 = next;
                                    vVar.c1 = 2;
                                    a = interfaceC9181rA2.a(vVar);
                                    if (a != l2) {
                                        oo13 = oo1;
                                        obj2 = next;
                                        obj = a;
                                        if (!((Boolean) obj).booleanValue()) {
                                            C11128zA.b(oo13, null);
                                            return obj2;
                                        }
                                    }
                                    return l2;
                                }
                            } catch (Throwable th) {
                                th = th;
                                oo12 = oo13;
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    C11128zA.b(oo12, th);
                                    throw th2;
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        interfaceC9181rA = (InterfaceC9181rA) vVar.Z0;
                        oo12 = (OO1) vVar.Y0;
                        try {
                            RT1.n(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                        }
                    }
                } else {
                    RT1.n(obj);
                    try {
                        InterfaceC9181rA it = oo1.iterator();
                        vVar.Y0 = oo1;
                        vVar.Z0 = it;
                        vVar.c1 = 1;
                        Object a2 = it.a(vVar);
                        if (a2 != l2) {
                            oo12 = oo1;
                            interfaceC9181rA = it;
                            obj = a2;
                        }
                        return l2;
                    } catch (Throwable th4) {
                        oo12 = oo1;
                        th = th4;
                        throw th;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    C11128zA.b(oo12, null);
                    return null;
                }
                next = interfaceC9181rA.next();
                OO1 oo14 = oo12;
                interfaceC9181rA2 = interfaceC9181rA;
                oo1 = oo14;
                vVar.Y0 = oo1;
                vVar.Z0 = interfaceC9181rA2;
                vVar.a1 = next;
                vVar.c1 = 2;
                a = interfaceC9181rA2.a(vVar);
                if (a != l2) {
                }
                return l2;
            }
        }
        vVar = new v(hm);
        obj = vVar.b1;
        Object l22 = C7289jT0.l();
        i = vVar.c1;
        if (i == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @HK1
    @NotNull
    public static final <E, R> OO1<R> M(@NotNull OO1<? extends E> oo1, @NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull VA0<? super E, ? super HM<? super R>, ? extends Object> va0) {
        return C10919yI1.i(C6502gE0.X, interfaceC5809dQ, 0, null, C11128zA.g(oo1), new w(oo1, va0, null), 6, null);
    }

    public static /* synthetic */ OO1 N(OO1 oo1, InterfaceC5809dQ interfaceC5809dQ, VA0 va0, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC5809dQ = C8909q40.g();
        }
        return C11128zA.J(oo1, interfaceC5809dQ, va0);
    }

    @HK1
    @NotNull
    public static final <E, R> OO1<R> O(@NotNull OO1<? extends E> oo1, @NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull XA0<? super Integer, ? super E, ? super HM<? super R>, ? extends Object> xa0) {
        return C10919yI1.i(C6502gE0.X, interfaceC5809dQ, 0, null, C11128zA.g(oo1), new x(oo1, xa0, null), 6, null);
    }

    public static /* synthetic */ OO1 P(OO1 oo1, InterfaceC5809dQ interfaceC5809dQ, XA0 xa0, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC5809dQ = C8909q40.g();
        }
        return C11128zA.L(oo1, interfaceC5809dQ, xa0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    public static final /* synthetic */ OO1 Q(OO1 oo1, InterfaceC5809dQ interfaceC5809dQ, XA0 xa0) {
        return C11128zA.y(C11128zA.L(oo1, interfaceC5809dQ, xa0));
    }

    public static /* synthetic */ OO1 R(OO1 oo1, InterfaceC5809dQ interfaceC5809dQ, XA0 xa0, int i, Object obj) {
        OO1 Q;
        if ((i & 1) != 0) {
            interfaceC5809dQ = C8909q40.g();
        }
        Q = Q(oo1, interfaceC5809dQ, xa0);
        return Q;
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    public static final /* synthetic */ OO1 S(OO1 oo1, InterfaceC5809dQ interfaceC5809dQ, VA0 va0) {
        return C11128zA.y(C11128zA.J(oo1, interfaceC5809dQ, va0));
    }

    public static /* synthetic */ OO1 T(OO1 oo1, InterfaceC5809dQ interfaceC5809dQ, VA0 va0, int i, Object obj) {
        OO1 S;
        if ((i & 1) != 0) {
            interfaceC5809dQ = C8909q40.g();
        }
        S = S(oo1, interfaceC5809dQ, va0);
        return S;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00ab A[Catch: all -> 0x00b9, TRY_LEAVE, TryCatch #2 {all -> 0x00b9, blocks: (B:102:0x00a3, B:104:0x00ab, B:98:0x008e, B:88:0x0062), top: B:120:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0086 A[Catch: all -> 0x005c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005c, blocks: (B:83:0x0058, B:92:0x007a, B:96:0x0086), top: B:122:0x0058 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x009f -> B:77:0x003d). Please submit an issue!!! */
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object U(OO1 oo1, Comparator comparator, HM hm) {
        y yVar;
        Object obj;
        int i;
        OO1 oo12;
        InterfaceC9181rA interfaceC9181rA;
        Comparator comparator2;
        Object next;
        InterfaceC9181rA interfaceC9181rA2;
        Comparator comparator3;
        Object a;
        if (hm instanceof y) {
            yVar = (y) hm;
            int i2 = yVar.d1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.d1 = i2 - Integer.MIN_VALUE;
                obj = yVar.c1;
                Object l2 = C7289jT0.l();
                i = yVar.d1;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            Object obj2 = yVar.b1;
                            interfaceC9181rA2 = (InterfaceC9181rA) yVar.a1;
                            OO1 oo13 = (OO1) yVar.Z0;
                            comparator3 = (Comparator) yVar.Y0;
                            try {
                                RT1.n(obj);
                                y yVar2 = yVar;
                                Object obj3 = obj2;
                                oo1 = oo13;
                                y yVar3 = yVar2;
                                if (!((Boolean) obj).booleanValue()) {
                                    next = interfaceC9181rA2.next();
                                    if (comparator3.compare(obj3, next) >= 0) {
                                        next = obj3;
                                    }
                                    yVar = yVar3;
                                    yVar.Y0 = comparator3;
                                    yVar.Z0 = oo1;
                                    yVar.a1 = interfaceC9181rA2;
                                    yVar.b1 = next;
                                    yVar.d1 = 2;
                                    a = interfaceC9181rA2.a(yVar);
                                    if (a != l2) {
                                        yVar2 = yVar;
                                        obj3 = next;
                                        obj = a;
                                        y yVar32 = yVar2;
                                        if (!((Boolean) obj).booleanValue()) {
                                            C11128zA.b(oo1, null);
                                            return obj3;
                                        }
                                    }
                                    return l2;
                                }
                            } catch (Throwable th) {
                                th = th;
                                oo12 = oo13;
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    C11128zA.b(oo12, th);
                                    throw th2;
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        interfaceC9181rA = (InterfaceC9181rA) yVar.a1;
                        oo12 = (OO1) yVar.Z0;
                        comparator2 = (Comparator) yVar.Y0;
                        try {
                            RT1.n(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                        }
                    }
                } else {
                    RT1.n(obj);
                    try {
                        InterfaceC9181rA it = oo1.iterator();
                        yVar.Y0 = comparator;
                        yVar.Z0 = oo1;
                        yVar.a1 = it;
                        yVar.d1 = 1;
                        Object a2 = it.a(yVar);
                        if (a2 != l2) {
                            oo12 = oo1;
                            interfaceC9181rA = it;
                            obj = a2;
                            comparator2 = comparator;
                        }
                        return l2;
                    } catch (Throwable th4) {
                        oo12 = oo1;
                        th = th4;
                        throw th;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    C11128zA.b(oo12, null);
                    return null;
                }
                next = interfaceC9181rA.next();
                OO1 oo14 = oo12;
                interfaceC9181rA2 = interfaceC9181rA;
                oo1 = oo14;
                comparator3 = comparator2;
                yVar.Y0 = comparator3;
                yVar.Z0 = oo1;
                yVar.a1 = interfaceC9181rA2;
                yVar.b1 = next;
                yVar.d1 = 2;
                a = interfaceC9181rA2.a(yVar);
                if (a != l2) {
                }
                return l2;
            }
        }
        yVar = new y(hm);
        obj = yVar.c1;
        Object l22 = C7289jT0.l();
        i = yVar.d1;
        if (i == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00ab A[Catch: all -> 0x00b9, TRY_LEAVE, TryCatch #2 {all -> 0x00b9, blocks: (B:102:0x00a3, B:104:0x00ab, B:98:0x008e, B:88:0x0062), top: B:120:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0086 A[Catch: all -> 0x005c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005c, blocks: (B:83:0x0058, B:92:0x007a, B:96:0x0086), top: B:122:0x0058 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x009f -> B:77:0x003d). Please submit an issue!!! */
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object V(OO1 oo1, Comparator comparator, HM hm) {
        z zVar;
        Object obj;
        int i;
        OO1 oo12;
        InterfaceC9181rA interfaceC9181rA;
        Comparator comparator2;
        Object next;
        InterfaceC9181rA interfaceC9181rA2;
        Comparator comparator3;
        Object a;
        if (hm instanceof z) {
            zVar = (z) hm;
            int i2 = zVar.d1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zVar.d1 = i2 - Integer.MIN_VALUE;
                obj = zVar.c1;
                Object l2 = C7289jT0.l();
                i = zVar.d1;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            Object obj2 = zVar.b1;
                            interfaceC9181rA2 = (InterfaceC9181rA) zVar.a1;
                            OO1 oo13 = (OO1) zVar.Z0;
                            comparator3 = (Comparator) zVar.Y0;
                            try {
                                RT1.n(obj);
                                z zVar2 = zVar;
                                Object obj3 = obj2;
                                oo1 = oo13;
                                z zVar3 = zVar2;
                                if (!((Boolean) obj).booleanValue()) {
                                    next = interfaceC9181rA2.next();
                                    if (comparator3.compare(obj3, next) <= 0) {
                                        next = obj3;
                                    }
                                    zVar = zVar3;
                                    zVar.Y0 = comparator3;
                                    zVar.Z0 = oo1;
                                    zVar.a1 = interfaceC9181rA2;
                                    zVar.b1 = next;
                                    zVar.d1 = 2;
                                    a = interfaceC9181rA2.a(zVar);
                                    if (a != l2) {
                                        zVar2 = zVar;
                                        obj3 = next;
                                        obj = a;
                                        z zVar32 = zVar2;
                                        if (!((Boolean) obj).booleanValue()) {
                                            C11128zA.b(oo1, null);
                                            return obj3;
                                        }
                                    }
                                    return l2;
                                }
                            } catch (Throwable th) {
                                th = th;
                                oo12 = oo13;
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    C11128zA.b(oo12, th);
                                    throw th2;
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        interfaceC9181rA = (InterfaceC9181rA) zVar.a1;
                        oo12 = (OO1) zVar.Z0;
                        comparator2 = (Comparator) zVar.Y0;
                        try {
                            RT1.n(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                        }
                    }
                } else {
                    RT1.n(obj);
                    try {
                        InterfaceC9181rA it = oo1.iterator();
                        zVar.Y0 = comparator;
                        zVar.Z0 = oo1;
                        zVar.a1 = it;
                        zVar.d1 = 1;
                        Object a2 = it.a(zVar);
                        if (a2 != l2) {
                            oo12 = oo1;
                            interfaceC9181rA = it;
                            obj = a2;
                            comparator2 = comparator;
                        }
                        return l2;
                    } catch (Throwable th4) {
                        oo12 = oo1;
                        th = th4;
                        throw th;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    C11128zA.b(oo12, null);
                    return null;
                }
                next = interfaceC9181rA.next();
                OO1 oo14 = oo12;
                interfaceC9181rA2 = interfaceC9181rA;
                oo1 = oo14;
                comparator3 = comparator2;
                zVar.Y0 = comparator3;
                zVar.Z0 = oo1;
                zVar.a1 = interfaceC9181rA2;
                zVar.b1 = next;
                zVar.d1 = 2;
                a = interfaceC9181rA2.a(zVar);
                if (a != l2) {
                }
                return l2;
            }
        }
        zVar = new z(hm);
        obj = zVar.c1;
        Object l22 = C7289jT0.l();
        i = zVar.d1;
        if (i == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0037  */
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object W(OO1 oo1, HM hm) {
        A a;
        int i;
        try {
            if (hm instanceof A) {
                a = (A) hm;
                int i2 = a.a1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    a.a1 = i2 - Integer.MIN_VALUE;
                    Object obj = a.Z0;
                    Object l2 = C7289jT0.l();
                    i = a.a1;
                    if (i == 0) {
                        if (i == 1) {
                            oo1 = (OO1) a.Y0;
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        InterfaceC9181rA it = oo1.iterator();
                        a.Y0 = oo1;
                        a.a1 = 1;
                        obj = it.a(a);
                        if (obj == l2) {
                            return l2;
                        }
                    }
                    Boolean a2 = C10557wp.a(!((Boolean) obj).booleanValue());
                    C11128zA.b(oo1, null);
                    return a2;
                }
            }
            if (i == 0) {
            }
            Boolean a22 = C10557wp.a(!((Boolean) obj).booleanValue());
            C11128zA.b(oo1, null);
            return a22;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C11128zA.b(oo1, th);
                throw th2;
            }
        }
        a = new A(hm);
        Object obj2 = a.Z0;
        Object l22 = C7289jT0.l();
        i = a.a1;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006c A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #2 {all -> 0x004a, blocks: (B:76:0x0046, B:85:0x0064, B:87:0x006c, B:97:0x0096, B:98:0x009d), top: B:109:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x008e A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #1 {all -> 0x0032, blocks: (B:69:0x002e, B:91:0x0081, B:95:0x008e, B:96:0x0095), top: B:107:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0096 A[Catch: all -> 0x004a, TRY_ENTER, TryCatch #2 {all -> 0x004a, blocks: (B:76:0x0046, B:85:0x0064, B:87:0x006c, B:97:0x0096, B:98:0x009d), top: B:109:0x0046 }] */
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object Y(OO1 oo1, HM hm) {
        C c;
        Object obj;
        int i;
        OO1 oo12;
        Throwable th;
        InterfaceC9181rA interfaceC9181rA;
        Object obj2;
        OO1 oo13;
        if (hm instanceof C) {
            c = (C) hm;
            int i2 = c.b1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c.b1 = i2 - Integer.MIN_VALUE;
                obj = c.a1;
                Object l2 = C7289jT0.l();
                i = c.b1;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            obj2 = c.Z0;
                            oo13 = (OO1) c.Y0;
                            try {
                                RT1.n(obj);
                                if (((Boolean) obj).booleanValue()) {
                                    C11128zA.b(oo13, null);
                                    return obj2;
                                }
                                throw new IllegalArgumentException("ReceiveChannel has more than one element.");
                            } catch (Throwable th2) {
                                th = th2;
                                oo12 = oo13;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    C11128zA.b(oo12, th);
                                    throw th3;
                                }
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC9181rA = (InterfaceC9181rA) c.Z0;
                    oo12 = (OO1) c.Y0;
                    try {
                        RT1.n(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                } else {
                    RT1.n(obj);
                    try {
                        InterfaceC9181rA it = oo1.iterator();
                        c.Y0 = oo1;
                        c.Z0 = it;
                        c.b1 = 1;
                        Object a = it.a(c);
                        if (a != l2) {
                            oo12 = oo1;
                            interfaceC9181rA = it;
                            obj = a;
                        }
                        return l2;
                    } catch (Throwable th5) {
                        oo12 = oo1;
                        th = th5;
                        throw th;
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    Object next = interfaceC9181rA.next();
                    c.Y0 = oo12;
                    c.Z0 = next;
                    c.b1 = 2;
                    Object a2 = interfaceC9181rA.a(c);
                    if (a2 != l2) {
                        obj = a2;
                        obj2 = next;
                        oo13 = oo12;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                    return l2;
                }
                throw new NoSuchElementException("ReceiveChannel is empty.");
            }
        }
        c = new C(hm);
        obj = c.a1;
        Object l22 = C7289jT0.l();
        i = c.b1;
        if (i == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0071 A[Catch: all -> 0x004b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x004b, blocks: (B:77:0x0047, B:86:0x0065, B:90:0x0071), top: B:112:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0092  */
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object Z(OO1 oo1, HM hm) {
        D d;
        Object obj;
        int i;
        OO1 oo12;
        Throwable th;
        InterfaceC9181rA interfaceC9181rA;
        Object obj2;
        OO1 oo13;
        if (hm instanceof D) {
            d = (D) hm;
            int i2 = d.b1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d.b1 = i2 - Integer.MIN_VALUE;
                obj = d.a1;
                Object l2 = C7289jT0.l();
                i = d.b1;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            obj2 = d.Z0;
                            oo13 = (OO1) d.Y0;
                            try {
                                RT1.n(obj);
                                if (!((Boolean) obj).booleanValue()) {
                                    C11128zA.b(oo13, null);
                                    return null;
                                }
                                C11128zA.b(oo13, null);
                                return obj2;
                            } catch (Throwable th2) {
                                th = th2;
                                oo12 = oo13;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    C11128zA.b(oo12, th);
                                    throw th3;
                                }
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC9181rA = (InterfaceC9181rA) d.Z0;
                    oo12 = (OO1) d.Y0;
                    try {
                        RT1.n(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                } else {
                    RT1.n(obj);
                    try {
                        InterfaceC9181rA it = oo1.iterator();
                        d.Y0 = oo1;
                        d.Z0 = it;
                        d.b1 = 1;
                        Object a = it.a(d);
                        if (a != l2) {
                            oo12 = oo1;
                            interfaceC9181rA = it;
                            obj = a;
                        }
                        return l2;
                    } catch (Throwable th5) {
                        oo12 = oo1;
                        th = th5;
                        throw th;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    C11128zA.b(oo12, null);
                    return null;
                }
                Object next = interfaceC9181rA.next();
                d.Y0 = oo12;
                d.Z0 = next;
                d.b1 = 2;
                Object a2 = interfaceC9181rA.a(d);
                if (a2 != l2) {
                    obj = a2;
                    obj2 = next;
                    oo13 = oo12;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
                return l2;
            }
        }
        d = new D(hm);
        obj = d.a1;
        Object l22 = C7289jT0.l();
        i = d.b1;
        if (i == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    public static final /* synthetic */ OO1 a0(OO1 oo1, int i, InterfaceC5809dQ interfaceC5809dQ) {
        return C10919yI1.i(C6502gE0.X, interfaceC5809dQ, 0, null, C11128zA.g(oo1), new E(i, oo1, null), 6, null);
    }

    public static /* synthetic */ OO1 b0(OO1 oo1, int i, InterfaceC5809dQ interfaceC5809dQ, int i2, Object obj) {
        OO1 a0;
        if ((i2 & 2) != 0) {
            interfaceC5809dQ = C8909q40.g();
        }
        a0 = a0(oo1, i, interfaceC5809dQ);
        return a0;
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    public static final /* synthetic */ OO1 c0(OO1 oo1, InterfaceC5809dQ interfaceC5809dQ, VA0 va0) {
        return C10919yI1.i(C6502gE0.X, interfaceC5809dQ, 0, null, C11128zA.g(oo1), new F(oo1, va0, null), 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0037  */
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object d(OO1 oo1, HM hm) {
        C2907a c2907a;
        int i;
        try {
            if (hm instanceof C2907a) {
                c2907a = (C2907a) hm;
                int i2 = c2907a.a1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2907a.a1 = i2 - Integer.MIN_VALUE;
                    Object obj = c2907a.Z0;
                    Object l2 = C7289jT0.l();
                    i = c2907a.a1;
                    if (i == 0) {
                        if (i == 1) {
                            oo1 = (OO1) c2907a.Y0;
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        InterfaceC9181rA it = oo1.iterator();
                        c2907a.Y0 = oo1;
                        c2907a.a1 = 1;
                        obj = it.a(c2907a);
                        if (obj == l2) {
                            return l2;
                        }
                    }
                    C11128zA.b(oo1, null);
                    return obj;
                }
            }
            if (i == 0) {
            }
            C11128zA.b(oo1, null);
            return obj;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C11128zA.b(oo1, th);
                throw th2;
            }
        }
        c2907a = new C2907a(hm);
        Object obj2 = c2907a.Z0;
        Object l22 = C7289jT0.l();
        i = c2907a.a1;
    }

    public static /* synthetic */ OO1 d0(OO1 oo1, InterfaceC5809dQ interfaceC5809dQ, VA0 va0, int i, Object obj) {
        OO1 c0;
        if ((i & 1) != 0) {
            interfaceC5809dQ = C8909q40.g();
        }
        c0 = c0(oo1, interfaceC5809dQ, va0);
        return c0;
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @InterfaceC3681Mt1
    public static final <E, R> R e(@NotNull InterfaceC10800xp<E> interfaceC10800xp, @NotNull HA0<? super OO1<? extends E>, ? extends R> ha0) {
        OO1<E> z2 = interfaceC10800xp.z();
        try {
            return ha0.invoke(z2);
        } finally {
            UP0.d(1);
            OO1.a.b(z2, null, 1, null);
            UP0.c(1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0088, code lost:
        if (r2.d0(r8, r0) == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0078 A[Catch: all -> 0x003b, TryCatch #2 {all -> 0x003b, blocks: (B:61:0x0034, B:76:0x0070, B:78:0x0078, B:81:0x008b, B:68:0x0051), top: B:94:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x008b A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #2 {all -> 0x003b, blocks: (B:61:0x0034, B:76:0x0070, B:78:0x0078, B:81:0x008b, B:68:0x0051), top: B:94:0x0022 }] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v14, types: [o.OO1] */
    /* JADX WARN: Type inference failed for: r7v2, types: [o.OO1] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v5, types: [o.OO1, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0088 -> B:62:0x0037). Please submit an issue!!! */
    @HK1
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E, C extends InterfaceC10362w02<? super E>> Object e0(@NotNull OO1<? extends E> oo1, @NotNull C c, @NotNull HM<? super C> hm) {
        G g;
        int i;
        InterfaceC9181rA<? extends E> it;
        InterfaceC9181rA<? extends E> interfaceC9181rA;
        InterfaceC10362w02 interfaceC10362w02;
        C c2;
        Object a;
        try {
            if (hm instanceof G) {
                g = (G) hm;
                int i2 = g.c1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    g.c1 = i2 - Integer.MIN_VALUE;
                    Object obj = g.b1;
                    Object l2 = C7289jT0.l();
                    i = g.c1;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                interfaceC9181rA = (InterfaceC9181rA) g.a1;
                                ?? r7 = (C) ((OO1) g.Z0);
                                interfaceC10362w02 = (InterfaceC10362w02) g.Y0;
                                RT1.n(obj);
                                OO1<? extends E> oo12 = r7;
                                it = interfaceC9181rA;
                                oo1 = oo12;
                                c2 = (C) interfaceC10362w02;
                                g.Y0 = c2;
                                g.Z0 = oo1;
                                g.a1 = it;
                                g.c1 = 1;
                                a = it.a(g);
                                if (a != l2) {
                                    interfaceC9181rA = it;
                                    obj = a;
                                    interfaceC10362w02 = c2;
                                    c = (C) oo1;
                                    if (!((Boolean) obj).booleanValue()) {
                                        E next = interfaceC9181rA.next();
                                        g.Y0 = interfaceC10362w02;
                                        g.Z0 = (Object) c;
                                        g.a1 = interfaceC9181rA;
                                        g.c1 = 2;
                                        oo12 = c;
                                    } else {
                                        C7458kA2 c7458kA2 = C7458kA2.a;
                                        C11128zA.b((OO1) c, null);
                                        return interfaceC10362w02;
                                    }
                                }
                                return l2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC9181rA = (InterfaceC9181rA) g.a1;
                        C c3 = (C) ((OO1) g.Z0);
                        interfaceC10362w02 = (InterfaceC10362w02) g.Y0;
                        RT1.n(obj);
                        c = c3;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        RT1.n(obj);
                        try {
                            it = oo1.iterator();
                            c2 = c;
                            g.Y0 = c2;
                            g.Z0 = oo1;
                            g.a1 = it;
                            g.c1 = 1;
                            a = it.a(g);
                            if (a != l2) {
                            }
                            return l2;
                        } catch (Throwable th) {
                            c = oo1;
                            th = th;
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                C11128zA.b(c, th);
                                throw th2;
                            }
                        }
                    }
                }
            }
            if (i == 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        g = new G(hm);
        Object obj2 = g.b1;
        Object l22 = C7289jT0.l();
        i = g.c1;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x006d A[Catch: all -> 0x0077, TryCatch #1 {all -> 0x0077, blocks: (B:74:0x0065, B:76:0x006d, B:79:0x007a), top: B:90:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x007a A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #1 {all -> 0x0077, blocks: (B:74:0x0065, B:76:0x006d, B:79:0x007a), top: B:90:0x0065 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0061 -> B:62:0x0038). Please submit an issue!!! */
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E> Object f(@NotNull InterfaceC10800xp<E> interfaceC10800xp, @NotNull HA0<? super E, C7458kA2> ha0, @NotNull HM<? super C7458kA2> hm) {
        C2908b c2908b;
        int i;
        OO1<E> oo1;
        Throwable th;
        OO1<E> oo12;
        InterfaceC9181rA<E> it;
        Object a;
        if (hm instanceof C2908b) {
            c2908b = (C2908b) hm;
            int i2 = c2908b.c1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2908b.c1 = i2 - Integer.MIN_VALUE;
                Object obj = c2908b.b1;
                Object l2 = C7289jT0.l();
                i = c2908b.c1;
                if (i == 0) {
                    if (i == 1) {
                        InterfaceC9181rA<E> interfaceC9181rA = (InterfaceC9181rA) c2908b.a1;
                        oo1 = (OO1) c2908b.Z0;
                        HA0<? super E, C7458kA2> ha02 = (HA0) c2908b.Y0;
                        try {
                            RT1.n(obj);
                            C2908b c2908b2 = c2908b;
                            OO1<E> oo13 = oo1;
                            ha0 = ha02;
                            InterfaceC9181rA<E> interfaceC9181rA2 = interfaceC9181rA;
                            C2908b c2908b3 = c2908b2;
                            try {
                                if (!((Boolean) obj).booleanValue()) {
                                    ha0.invoke((Object) interfaceC9181rA2.next());
                                    oo12 = oo13;
                                    c2908b = c2908b3;
                                    it = interfaceC9181rA2;
                                    try {
                                        c2908b.Y0 = ha0;
                                        c2908b.Z0 = oo12;
                                        c2908b.a1 = it;
                                        c2908b.c1 = 1;
                                        a = it.a(c2908b);
                                        if (a != l2) {
                                            return l2;
                                        }
                                        c2908b2 = c2908b;
                                        oo13 = oo12;
                                        obj = a;
                                        interfaceC9181rA2 = it;
                                        C2908b c2908b32 = c2908b2;
                                        if (!((Boolean) obj).booleanValue()) {
                                            C7458kA2 c7458kA2 = C7458kA2.a;
                                            UP0.d(1);
                                            OO1.a.b(oo13, null, 1, null);
                                            UP0.c(1);
                                            return c7458kA2;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        oo1 = oo12;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                oo1 = oo13;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    OO1<E> z2 = interfaceC10800xp.z();
                    try {
                        oo12 = z2;
                        it = z2.iterator();
                        c2908b.Y0 = ha0;
                        c2908b.Z0 = oo12;
                        c2908b.a1 = it;
                        c2908b.c1 = 1;
                        a = it.a(c2908b);
                        if (a != l2) {
                        }
                    } catch (Throwable th5) {
                        oo1 = z2;
                        th = th5;
                    }
                }
                UP0.d(1);
                OO1.a.b(oo1, null, 1, null);
                UP0.c(1);
                throw th;
            }
        }
        c2908b = new C2908b(hm);
        Object obj2 = c2908b.b1;
        Object l22 = C7289jT0.l();
        i = c2908b.c1;
        if (i == 0) {
        }
        UP0.d(1);
        OO1.a.b(oo1, null, 1, null);
        UP0.c(1);
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:55:0x0031, B:68:0x005c, B:70:0x0064, B:64:0x004a, B:71:0x006d), top: B:82:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:55:0x0031, B:68:0x005c, B:70:0x0064, B:64:0x004a, B:71:0x006d), top: B:82:0x0031 }] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0059 -> B:68:0x005c). Please submit an issue!!! */
    @HK1
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E, C extends Collection<? super E>> Object f0(@NotNull OO1<? extends E> oo1, @NotNull C c, @NotNull HM<? super C> hm) {
        H h;
        int i;
        OO1<? extends E> oo12;
        Throwable th;
        InterfaceC9181rA<? extends E> it;
        C c2;
        Object a;
        if (hm instanceof H) {
            h = (H) hm;
            int i2 = h.c1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h.c1 = i2 - Integer.MIN_VALUE;
                Object obj = h.b1;
                Object l2 = C7289jT0.l();
                i = h.c1;
                if (i == 0) {
                    if (i == 1) {
                        InterfaceC9181rA<? extends E> interfaceC9181rA = (InterfaceC9181rA) h.a1;
                        oo12 = (OO1) h.Z0;
                        ?? r2 = (Collection) h.Y0;
                        try {
                            RT1.n(obj);
                            C c3 = r2;
                            InterfaceC9181rA<? extends E> interfaceC9181rA2 = interfaceC9181rA;
                            if (!((Boolean) obj).booleanValue()) {
                                c3.add(interfaceC9181rA2.next());
                                c2 = c3;
                                it = interfaceC9181rA2;
                                h.Y0 = c2;
                                h.Z0 = oo12;
                                h.a1 = it;
                                h.c1 = 1;
                                a = it.a(h);
                                if (a != l2) {
                                    return l2;
                                }
                                c3 = c2;
                                obj = a;
                                interfaceC9181rA2 = it;
                                if (!((Boolean) obj).booleanValue()) {
                                    C7458kA2 c7458kA2 = C7458kA2.a;
                                    C11128zA.b(oo12, null);
                                    return c3;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                C11128zA.b(oo12, th);
                                throw th3;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    try {
                        oo12 = oo1;
                        it = oo1.iterator();
                        c2 = c;
                        h.Y0 = c2;
                        h.Z0 = oo12;
                        h.a1 = it;
                        h.c1 = 1;
                        a = it.a(h);
                        if (a != l2) {
                        }
                    } catch (Throwable th4) {
                        oo12 = oo1;
                        th = th4;
                        throw th;
                    }
                }
            }
        }
        h = new H(hm);
        Object obj2 = h.b1;
        Object l22 = C7289jT0.l();
        i = h.c1;
        if (i == 0) {
        }
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E> Object g(InterfaceC10800xp<E> interfaceC10800xp, HA0<? super E, C7458kA2> ha0, HM<? super C7458kA2> hm) {
        OO1<E> z2 = interfaceC10800xp.z();
        try {
            InterfaceC9181rA<E> it = z2.iterator();
            while (true) {
                UP0.e(3);
                UP0.e(0);
                Object a = it.a(null);
                UP0.e(1);
                if (((Boolean) a).booleanValue()) {
                    ha0.invoke(it.next());
                } else {
                    C7458kA2 c7458kA2 = C7458kA2.a;
                    UP0.d(1);
                    OO1.a.b(z2, null, 1, null);
                    UP0.c(1);
                    return c7458kA2;
                }
            }
        } catch (Throwable th) {
            UP0.d(1);
            OO1.a.b(z2, null, 1, null);
            UP0.c(1);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:55:0x0031, B:68:0x005c, B:70:0x0064, B:64:0x004a, B:71:0x0077), top: B:82:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0077 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:55:0x0031, B:68:0x005c, B:70:0x0064, B:64:0x004a, B:71:0x0077), top: B:82:0x0031 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0059 -> B:68:0x005c). Please submit an issue!!! */
    @HK1
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <K, V, M extends Map<? super K, ? super V>> Object g0(@NotNull OO1<? extends C4180Rx1<? extends K, ? extends V>> oo1, @NotNull M m2, @NotNull HM<? super M> hm) {
        I i;
        int i2;
        OO1<? extends C4180Rx1<? extends K, ? extends V>> oo12;
        Throwable th;
        InterfaceC9181rA<? extends C4180Rx1<? extends K, ? extends V>> it;
        M m3;
        Object a;
        if (hm instanceof I) {
            i = (I) hm;
            int i3 = i.c1;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                i.c1 = i3 - Integer.MIN_VALUE;
                Object obj = i.b1;
                Object l2 = C7289jT0.l();
                i2 = i.c1;
                if (i2 == 0) {
                    if (i2 == 1) {
                        InterfaceC9181rA<? extends C4180Rx1<? extends K, ? extends V>> interfaceC9181rA = (InterfaceC9181rA) i.a1;
                        oo12 = (OO1) i.Z0;
                        Map map = (Map) i.Y0;
                        try {
                            RT1.n(obj);
                            Map map2 = map;
                            InterfaceC9181rA<? extends C4180Rx1<? extends K, ? extends V>> interfaceC9181rA2 = interfaceC9181rA;
                            if (!((Boolean) obj).booleanValue()) {
                                C4180Rx1<? extends K, ? extends V> next = interfaceC9181rA2.next();
                                map2.put(next.e(), next.f());
                                m3 = map2;
                                it = interfaceC9181rA2;
                                i.Y0 = m3;
                                i.Z0 = oo12;
                                i.a1 = it;
                                i.c1 = 1;
                                a = it.a(i);
                                if (a != l2) {
                                    return l2;
                                }
                                map2 = m3;
                                obj = a;
                                interfaceC9181rA2 = it;
                                if (!((Boolean) obj).booleanValue()) {
                                    C7458kA2 c7458kA2 = C7458kA2.a;
                                    C11128zA.b(oo12, null);
                                    return map2;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                C11128zA.b(oo12, th);
                                throw th3;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    try {
                        oo12 = oo1;
                        it = oo1.iterator();
                        m3 = m2;
                        i.Y0 = m3;
                        i.Z0 = oo12;
                        i.a1 = it;
                        i.c1 = 1;
                        a = it.a(i);
                        if (a != l2) {
                        }
                    } catch (Throwable th4) {
                        oo12 = oo1;
                        th = th4;
                        throw th;
                    }
                }
            }
        }
        i = new I(hm);
        Object obj2 = i.b1;
        Object l22 = C7289jT0.l();
        i2 = i.c1;
        if (i2 == 0) {
        }
    }

    @HK1
    @NotNull
    public static final HA0<Throwable, C7458kA2> h(@NotNull final OO1<?> oo1) {
        return new HA0() { // from class: o.CA
            @Override // o.HA0
            public final Object invoke(Object obj) {
                C7458kA2 i;
                i = FA.i(OO1.this, (Throwable) obj);
                return i;
            }
        };
    }

    public static final C7458kA2 i(OO1 oo1, Throwable th) {
        C11128zA.b(oo1, th);
        return C7458kA2.a;
    }

    @HK1
    @NotNull
    public static final HA0<Throwable, C7458kA2> j(@NotNull final OO1<?>... oo1Arr) {
        return new HA0() { // from class: o.DA
            @Override // o.HA0
            public final Object invoke(Object obj) {
                C7458kA2 k;
                k = FA.k(oo1Arr, (Throwable) obj);
                return k;
            }
        };
    }

    @HK1
    @Nullable
    public static final <E> Object j0(@NotNull OO1<? extends E> oo1, @NotNull HM<? super Set<E>> hm) {
        return C11128zA.f0(oo1, new LinkedHashSet(), hm);
    }

    public static final C7458kA2 k(OO1[] oo1Arr, Throwable th) {
        Throwable th2 = null;
        for (OO1 oo1 : oo1Arr) {
            try {
                C11128zA.b(oo1, th);
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    C3917Pf0.a(th2, th3);
                }
            }
        }
        if (th2 == null) {
            return C7458kA2.a;
        }
        throw th2;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0068 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:59:0x0031, B:72:0x0060, B:74:0x0068, B:75:0x0072), top: B:88:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0072 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:59:0x0031, B:72:0x0060, B:74:0x0068, B:75:0x0072), top: B:88:0x0031 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x005d -> B:72:0x0060). Please submit an issue!!! */
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object l(OO1 oo1, HM hm) {
        C2909c c2909c;
        int i;
        OO1 oo12;
        Throwable th;
        RP1.f fVar;
        OO1 oo13;
        InterfaceC9181rA it;
        Object a;
        if (hm instanceof C2909c) {
            c2909c = (C2909c) hm;
            int i2 = c2909c.c1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2909c.c1 = i2 - Integer.MIN_VALUE;
                Object obj = c2909c.b1;
                Object l2 = C7289jT0.l();
                i = c2909c.c1;
                if (i == 0) {
                    if (i == 1) {
                        it = (InterfaceC9181rA) c2909c.a1;
                        oo12 = (OO1) c2909c.Z0;
                        fVar = (RP1.f) c2909c.Y0;
                        try {
                            RT1.n(obj);
                            if (!((Boolean) obj).booleanValue()) {
                                it.next();
                                fVar.X++;
                                oo13 = oo12;
                                try {
                                    c2909c.Y0 = fVar;
                                    c2909c.Z0 = oo13;
                                    c2909c.a1 = it;
                                    c2909c.c1 = 1;
                                    a = it.a(c2909c);
                                    if (a != l2) {
                                        return l2;
                                    }
                                    oo12 = oo13;
                                    obj = a;
                                    if (!((Boolean) obj).booleanValue()) {
                                        C7458kA2 c7458kA2 = C7458kA2.a;
                                        C11128zA.b(oo12, null);
                                        return C10557wp.f(fVar.X);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    oo12 = oo13;
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        C11128zA.b(oo12, th);
                                        throw th3;
                                    }
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    try {
                        fVar = new RP1.f();
                        oo13 = oo1;
                        it = oo1.iterator();
                        c2909c.Y0 = fVar;
                        c2909c.Z0 = oo13;
                        c2909c.a1 = it;
                        c2909c.c1 = 1;
                        a = it.a(c2909c);
                        if (a != l2) {
                        }
                    } catch (Throwable th5) {
                        oo12 = oo1;
                        th = th5;
                        throw th;
                    }
                }
            }
        }
        c2909c = new C2909c(hm);
        Object obj2 = c2909c.b1;
        Object l22 = C7289jT0.l();
        i = c2909c.c1;
        if (i == 0) {
        }
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    public static final /* synthetic */ OO1 l0(OO1 oo1, InterfaceC5809dQ interfaceC5809dQ) {
        return C10919yI1.i(C6502gE0.X, interfaceC5809dQ, 0, null, C11128zA.g(oo1), new J(oo1, null), 6, null);
    }

    public static /* synthetic */ OO1 m0(OO1 oo1, InterfaceC5809dQ interfaceC5809dQ, int i, Object obj) {
        OO1 l0;
        if ((i & 1) != 0) {
            interfaceC5809dQ = C8909q40.g();
        }
        l0 = l0(oo1, interfaceC5809dQ);
        return l0;
    }

    @HK1
    @NotNull
    public static final <E, K> OO1<E> n(@NotNull OO1<? extends E> oo1, @NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull VA0<? super E, ? super HM<? super K>, ? extends Object> va0) {
        return C10919yI1.i(C6502gE0.X, interfaceC5809dQ, 0, null, C11128zA.g(oo1), new C2911e(oo1, va0, null), 6, null);
    }

    public static /* synthetic */ OO1 o(OO1 oo1, InterfaceC5809dQ interfaceC5809dQ, VA0 va0, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC5809dQ = C8909q40.g();
        }
        return C11128zA.k(oo1, interfaceC5809dQ, va0);
    }

    @HK1
    @NotNull
    public static final <E, R, V> OO1<V> o0(@NotNull OO1<? extends E> oo1, @NotNull OO1<? extends R> oo12, @NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull VA0<? super E, ? super R, ? extends V> va0) {
        return C10919yI1.i(C6502gE0.X, interfaceC5809dQ, 0, null, C11128zA.h(oo1, oo12), new K(oo12, oo1, va0, null), 6, null);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    public static final /* synthetic */ OO1 p(OO1 oo1, int i, InterfaceC5809dQ interfaceC5809dQ) {
        return C10919yI1.i(C6502gE0.X, interfaceC5809dQ, 0, null, C11128zA.g(oo1), new C2912f(i, oo1, null), 6, null);
    }

    public static /* synthetic */ OO1 p0(OO1 oo1, OO1 oo12, InterfaceC5809dQ interfaceC5809dQ, VA0 va0, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC5809dQ = C8909q40.g();
        }
        return C11128zA.q0(oo1, oo12, interfaceC5809dQ, va0);
    }

    public static /* synthetic */ OO1 q(OO1 oo1, int i, InterfaceC5809dQ interfaceC5809dQ, int i2, Object obj) {
        OO1 p2;
        if ((i2 & 2) != 0) {
            interfaceC5809dQ = C8909q40.g();
        }
        p2 = p(oo1, i, interfaceC5809dQ);
        return p2;
    }

    public static final C4180Rx1 q0(Object obj, Object obj2) {
        return C6670gv2.a(obj, obj2);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    public static final /* synthetic */ OO1 r(OO1 oo1, InterfaceC5809dQ interfaceC5809dQ, VA0 va0) {
        return C10919yI1.i(C6502gE0.X, interfaceC5809dQ, 0, null, C11128zA.g(oo1), new C2913g(oo1, va0, null), 6, null);
    }

    public static /* synthetic */ OO1 s(OO1 oo1, InterfaceC5809dQ interfaceC5809dQ, VA0 va0, int i, Object obj) {
        OO1 r2;
        if ((i & 1) != 0) {
            interfaceC5809dQ = C8909q40.g();
        }
        r2 = r(oo1, interfaceC5809dQ, va0);
        return r2;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006c A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:60:0x0035, B:73:0x0064, B:75:0x006c, B:81:0x007d, B:82:0x0094), top: B:94:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x007d A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #2 {all -> 0x0039, blocks: (B:60:0x0035, B:73:0x0064, B:75:0x006c, B:81:0x007d, B:82:0x0094), top: B:94:0x0035 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x005f -> B:73:0x0064). Please submit an issue!!! */
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object t(OO1 oo1, int i, HM hm) {
        C2914h c2914h;
        int i2;
        OO1 oo12;
        Throwable th;
        InterfaceC9181rA it;
        int i3;
        Object a;
        try {
            if (hm instanceof C2914h) {
                c2914h = (C2914h) hm;
                int i4 = c2914h.d1;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c2914h.d1 = i4 - Integer.MIN_VALUE;
                    Object obj = c2914h.c1;
                    Object l2 = C7289jT0.l();
                    i2 = c2914h.d1;
                    if (i2 == 0) {
                        if (i2 == 1) {
                            int i5 = c2914h.Z0;
                            i = c2914h.Y0;
                            InterfaceC9181rA interfaceC9181rA = (InterfaceC9181rA) c2914h.b1;
                            oo12 = (OO1) c2914h.a1;
                            try {
                                RT1.n(obj);
                                if (!((Boolean) obj).booleanValue()) {
                                    Object next = interfaceC9181rA.next();
                                    int i6 = i5 + 1;
                                    if (i == i5) {
                                        C11128zA.b(oo12, null);
                                        return next;
                                    }
                                    it = interfaceC9181rA;
                                    oo1 = oo12;
                                    i3 = i6;
                                    c2914h.a1 = oo1;
                                    c2914h.b1 = it;
                                    c2914h.Y0 = i;
                                    c2914h.Z0 = i3;
                                    c2914h.d1 = 1;
                                    a = it.a(c2914h);
                                    if (a != l2) {
                                        return l2;
                                    }
                                    oo12 = oo1;
                                    i5 = i3;
                                    interfaceC9181rA = it;
                                    obj = a;
                                    if (!((Boolean) obj).booleanValue()) {
                                        throw new IndexOutOfBoundsException("ReceiveChannel doesn't contain element at index " + i + '.');
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    C11128zA.b(oo12, th);
                                    throw th3;
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        if (i >= 0) {
                            it = oo1.iterator();
                            i3 = 0;
                            c2914h.a1 = oo1;
                            c2914h.b1 = it;
                            c2914h.Y0 = i;
                            c2914h.Z0 = i3;
                            c2914h.d1 = 1;
                            a = it.a(c2914h);
                            if (a != l2) {
                            }
                        } else {
                            throw new IndexOutOfBoundsException("ReceiveChannel doesn't contain element at index " + i + '.');
                        }
                    }
                }
            }
            if (i2 == 0) {
            }
        } catch (Throwable th4) {
            oo12 = oo1;
            th = th4;
        }
        c2914h = new C2914h(hm);
        Object obj2 = c2914h.c1;
        Object l22 = C7289jT0.l();
        i2 = c2914h.d1;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0070 A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:76:0x0068, B:78:0x0070, B:72:0x0053, B:71:0x004e), top: B:92:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0064 -> B:76:0x0068). Please submit an issue!!! */
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object u(OO1 oo1, int i, HM hm) {
        C2915i c2915i;
        int i2;
        InterfaceC9181rA it;
        int i3;
        Throwable th;
        OO1 oo12;
        Object a;
        if (hm instanceof C2915i) {
            c2915i = (C2915i) hm;
            int i4 = c2915i.d1;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c2915i.d1 = i4 - Integer.MIN_VALUE;
                Object obj = c2915i.c1;
                Object l2 = C7289jT0.l();
                i2 = c2915i.d1;
                if (i2 == 0) {
                    if (i2 == 1) {
                        int i5 = c2915i.Z0;
                        i = c2915i.Y0;
                        InterfaceC9181rA interfaceC9181rA = (InterfaceC9181rA) c2915i.b1;
                        oo12 = (OO1) c2915i.a1;
                        try {
                            RT1.n(obj);
                            i3 = i5;
                            oo1 = oo12;
                            C2915i c2915i2 = c2915i;
                            InterfaceC9181rA interfaceC9181rA2 = interfaceC9181rA;
                            if (!((Boolean) obj).booleanValue()) {
                                Object next = interfaceC9181rA2.next();
                                int i6 = i3 + 1;
                                if (i == i3) {
                                    C11128zA.b(oo1, null);
                                    return next;
                                }
                                it = interfaceC9181rA2;
                                c2915i = c2915i2;
                                i3 = i6;
                                c2915i.a1 = oo1;
                                c2915i.b1 = it;
                                c2915i.Y0 = i;
                                c2915i.Z0 = i3;
                                c2915i.d1 = 1;
                                a = it.a(c2915i);
                                if (a != l2) {
                                    return l2;
                                }
                                C2915i c2915i3 = c2915i;
                                interfaceC9181rA2 = it;
                                obj = a;
                                c2915i2 = c2915i3;
                                if (!((Boolean) obj).booleanValue()) {
                                    C11128zA.b(oo1, null);
                                    return null;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                C11128zA.b(oo12, th);
                                throw th3;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    if (i < 0) {
                        C11128zA.b(oo1, null);
                        return null;
                    }
                    try {
                        it = oo1.iterator();
                        i3 = 0;
                        c2915i.a1 = oo1;
                        c2915i.b1 = it;
                        c2915i.Y0 = i;
                        c2915i.Z0 = i3;
                        c2915i.d1 = 1;
                        a = it.a(c2915i);
                        if (a != l2) {
                        }
                    } catch (Throwable th4) {
                        oo12 = oo1;
                        th = th4;
                        throw th;
                    }
                }
            }
        }
        c2915i = new C2915i(hm);
        Object obj2 = c2915i.c1;
        Object l22 = C7289jT0.l();
        i2 = c2915i.d1;
        if (i2 == 0) {
        }
    }

    @HK1
    @NotNull
    public static final <E> OO1<E> v(@NotNull OO1<? extends E> oo1, @NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull VA0<? super E, ? super HM<? super Boolean>, ? extends Object> va0) {
        return C10919yI1.i(C6502gE0.X, interfaceC5809dQ, 0, null, C11128zA.g(oo1), new C2916j(oo1, va0, null), 6, null);
    }

    public static /* synthetic */ OO1 w(OO1 oo1, InterfaceC5809dQ interfaceC5809dQ, VA0 va0, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC5809dQ = C8909q40.g();
        }
        return C11128zA.s(oo1, interfaceC5809dQ, va0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    public static final /* synthetic */ OO1 x(OO1 oo1, InterfaceC5809dQ interfaceC5809dQ, XA0 xa0) {
        return C10919yI1.i(C6502gE0.X, interfaceC5809dQ, 0, null, C11128zA.g(oo1), new C2917k(oo1, xa0, null), 6, null);
    }

    public static /* synthetic */ OO1 y(OO1 oo1, InterfaceC5809dQ interfaceC5809dQ, XA0 xa0, int i, Object obj) {
        OO1 x2;
        if ((i & 1) != 0) {
            interfaceC5809dQ = C8909q40.g();
        }
        x2 = x(oo1, interfaceC5809dQ, xa0);
        return x2;
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility")
    public static final /* synthetic */ OO1 z(OO1 oo1, InterfaceC5809dQ interfaceC5809dQ, VA0 va0) {
        return C11128zA.s(oo1, interfaceC5809dQ, new l(va0, null));
    }
}
