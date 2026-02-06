package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.AbstractC5713d2;
import o.C11040yo0;
import o.C6842he;
import o.C9740tS0;
import o.IC0;
import o.IC0.b;
import o.IM2;
import o.InterfaceC3540Li1;

/* loaded from: classes.dex */
public abstract class IC0<MessageType extends IC0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends AbstractC5713d2<MessageType, BuilderType> {
    private static Map<Object, IC0<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected C10888yA2 unknownFields = C10888yA2.e();
    protected int memoizedSerializedSize = -1;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IM2.c.values().length];
            a = iArr;
            try {
                iArr[IM2.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[IM2.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b<MessageType extends IC0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends AbstractC5713d2.a<MessageType, BuilderType> {
        public final MessageType X;
        public MessageType Y;
        public boolean Z = false;

        public b(MessageType messagetype) {
            this.X = messagetype;
            this.Y = (MessageType) messagetype.y1(i.NEW_MUTABLE_INSTANCE);
        }

        @Override // o.InterfaceC3540Li1.a
        /* renamed from: L1 */
        public final MessageType build() {
            MessageType i2 = i2();
            if (i2.isInitialized()) {
                return i2;
            }
            throw AbstractC5713d2.a.K1(i2);
        }

        @Override // o.InterfaceC3540Li1.a
        /* renamed from: M1 */
        public MessageType i2() {
            if (this.Z) {
                return this.Y;
            }
            this.Y.N1();
            this.Z = true;
            return this.Y;
        }

        @Override // o.InterfaceC3540Li1.a
        /* renamed from: N1 */
        public final BuilderType clear() {
            this.Y = (MessageType) this.Y.y1(i.NEW_MUTABLE_INSTANCE);
            return this;
        }

        @Override // o.AbstractC5713d2.a
        /* renamed from: O1 */
        public BuilderType u1() {
            BuilderType buildertype = (BuilderType) u0().k0();
            buildertype.U1(i2());
            return buildertype;
        }

        public void P1() {
            if (this.Z) {
                MessageType messagetype = (MessageType) this.Y.y1(i.NEW_MUTABLE_INSTANCE);
                X1(messagetype, this.Y);
                this.Y = messagetype;
                this.Z = false;
            }
        }

        @Override // o.InterfaceC3637Mi1
        /* renamed from: Q1 */
        public MessageType u0() {
            return this.X;
        }

        @Override // o.AbstractC5713d2.a
        /* renamed from: R1 */
        public BuilderType w1(MessageType messagetype) {
            return U1(messagetype);
        }

        @Override // o.AbstractC5713d2.a, o.InterfaceC3540Li1.a
        /* renamed from: S1 */
        public BuilderType y3(KE ke, C3151Hj0 c3151Hj0) throws IOException {
            P1();
            try {
                XJ1.a().j(this.Y).i(this.Y, LE.S(ke), c3151Hj0);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        public BuilderType U1(MessageType messagetype) {
            P1();
            X1(this.Y, messagetype);
            return this;
        }

        @Override // o.AbstractC5713d2.a, o.InterfaceC3540Li1.a
        /* renamed from: V1 */
        public BuilderType V3(byte[] bArr, int i, int i2) throws C9258rT0 {
            return d3(bArr, i, i2, C3151Hj0.d());
        }

        @Override // o.AbstractC5713d2.a, o.InterfaceC3540Li1.a
        /* renamed from: W1 */
        public BuilderType d3(byte[] bArr, int i, int i2, C3151Hj0 c3151Hj0) throws C9258rT0 {
            P1();
            try {
                XJ1.a().j(this.Y).c(this.Y, bArr, i, i + i2, new C6842he.b(c3151Hj0));
                return this;
            } catch (IOException e) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e);
            } catch (IndexOutOfBoundsException unused) {
                throw C9258rT0.l();
            } catch (C9258rT0 e2) {
                throw e2;
            }
        }

        public final void X1(MessageType messagetype, MessageType messagetype2) {
            XJ1.a().j(messagetype).a(messagetype, messagetype2);
        }

        @Override // o.InterfaceC3637Mi1
        public final boolean isInitialized() {
            return IC0.M1(this.Y, false);
        }
    }

    /* loaded from: classes.dex */
    public static class c<T extends IC0<T, ?>> extends D2<T> {
        public final T b;

        public c(T t) {
            this.b = t;
        }

        @Override // o.InterfaceC3892Oy1
        /* renamed from: b0 */
        public T x(KE ke, C3151Hj0 c3151Hj0) throws C9258rT0 {
            return (T) IC0.s2(this.b, ke, c3151Hj0);
        }

        @Override // o.D2, o.InterfaceC3892Oy1
        /* renamed from: c0 */
        public T b(byte[] bArr, int i, int i2, C3151Hj0 c3151Hj0) throws C9258rT0 {
            return (T) IC0.t2(this.b, bArr, i, i2, c3151Hj0);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d<MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements f<MessageType, BuilderType> {
        public d(MessageType messagetype) {
            super(messagetype);
        }

        private C11040yo0<g> b2() {
            C11040yo0<g> c11040yo0 = ((e) this.Y).extensions;
            if (c11040yo0.D()) {
                C11040yo0<g> clone = c11040yo0.clone();
                ((e) this.Y).extensions = clone;
                return clone;
            }
            return c11040yo0;
        }

        @Override // o.IC0.b
        public void P1() {
            if (!this.Z) {
                return;
            }
            super.P1();
            MessageType messagetype = this.Y;
            ((e) messagetype).extensions = ((e) messagetype).extensions.clone();
        }

        @Override // o.IC0.f
        public final <Type> boolean Q0(AbstractC2955Fj0<MessageType, Type> abstractC2955Fj0) {
            return ((e) this.Y).Q0(abstractC2955Fj0);
        }

        @Override // o.IC0.f
        public final <Type> int V(AbstractC2955Fj0<MessageType, List<Type>> abstractC2955Fj0) {
            return ((e) this.Y).V(abstractC2955Fj0);
        }

        public final <Type> BuilderType Y1(AbstractC2955Fj0<MessageType, List<Type>> abstractC2955Fj0, Type type) {
            h<MessageType, ?> t1 = IC0.t1(abstractC2955Fj0);
            f2(t1);
            P1();
            b2().h(t1.d, t1.j(type));
            return this;
        }

        @Override // o.IC0.b, o.InterfaceC3540Li1.a
        /* renamed from: Z1 */
        public final MessageType i2() {
            if (this.Z) {
                return (MessageType) this.Y;
            }
            ((e) this.Y).extensions.I();
            return (MessageType) super.i2();
        }

        public final <Type> BuilderType a2(AbstractC2955Fj0<MessageType, ?> abstractC2955Fj0) {
            h<MessageType, ?> t1 = IC0.t1(abstractC2955Fj0);
            f2(t1);
            P1();
            b2().j(t1.d);
            return this;
        }

        public void c2(C11040yo0<g> c11040yo0) {
            P1();
            ((e) this.Y).extensions = c11040yo0;
        }

        public final <Type> BuilderType d2(AbstractC2955Fj0<MessageType, List<Type>> abstractC2955Fj0, int i, Type type) {
            h<MessageType, ?> t1 = IC0.t1(abstractC2955Fj0);
            f2(t1);
            P1();
            b2().P(t1.d, i, t1.j(type));
            return this;
        }

        public final <Type> BuilderType e2(AbstractC2955Fj0<MessageType, Type> abstractC2955Fj0, Type type) {
            h<MessageType, ?> t1 = IC0.t1(abstractC2955Fj0);
            f2(t1);
            P1();
            b2().O(t1.d, t1.k(type));
            return this;
        }

        public final void f2(h<MessageType, ?> hVar) {
            if (hVar.h() == u0()) {
                return;
            }
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        @Override // o.IC0.f
        public final <Type> Type n0(AbstractC2955Fj0<MessageType, List<Type>> abstractC2955Fj0, int i) {
            return (Type) ((e) this.Y).n0(abstractC2955Fj0, i);
        }

        @Override // o.IC0.f
        public final <Type> Type z0(AbstractC2955Fj0<MessageType, Type> abstractC2955Fj0) {
            return (Type) ((e) this.Y).z0(abstractC2955Fj0);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends IC0<MessageType, BuilderType> implements f<MessageType, BuilderType> {
        protected C11040yo0<g> extensions = C11040yo0.s();

        /* loaded from: classes.dex */
        public class a {
            public final Iterator<Map.Entry<g, Object>> a;
            public Map.Entry<g, Object> b;
            public final boolean c;

            public /* synthetic */ a(e eVar, boolean z, a aVar) {
                this(z);
            }

            public void a(int i, ME me) throws IOException {
                while (true) {
                    Map.Entry<g, Object> entry = this.b;
                    if (entry != null && entry.getKey().k() < i) {
                        g key = this.b.getKey();
                        if (this.c && key.z5() == IM2.c.MESSAGE && !key.g3()) {
                            me.P1(key.k(), (InterfaceC3540Li1) this.b.getValue());
                        } else {
                            C11040yo0.T(key, this.b.getValue(), me);
                        }
                        if (this.a.hasNext()) {
                            this.b = this.a.next();
                        } else {
                            this.b = null;
                        }
                    } else {
                        return;
                    }
                }
            }

            public a(boolean z) {
                Iterator<Map.Entry<g, Object>> H = e.this.extensions.H();
                this.a = H;
                if (H.hasNext()) {
                    this.b = H.next();
                }
                this.c = z;
            }
        }

        private void L2(h<MessageType, ?> hVar) {
            if (hVar.h() == u0()) {
                return;
            }
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public boolean A2() {
            return this.extensions.E();
        }

        public int B2() {
            return this.extensions.z();
        }

        public int C2() {
            return this.extensions.v();
        }

        public final void D2(MessageType messagetype) {
            if (this.extensions.D()) {
                this.extensions = this.extensions.clone();
            }
            this.extensions.J(messagetype.extensions);
        }

        public final void E2(AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0, h<?, ?> hVar) throws IOException {
            InterfaceC3540Li1.a aVar;
            InterfaceC3540Li1 interfaceC3540Li1 = (InterfaceC3540Li1) this.extensions.u(hVar.d);
            if (interfaceC3540Li1 != null) {
                aVar = interfaceC3540Li1.x();
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = hVar.c().k0();
            }
            aVar.B3(abstractC8616os, c3151Hj0);
            z2().O(hVar.d, hVar.j(aVar.build()));
        }

        public final <MessageType extends InterfaceC3540Li1> void F2(MessageType messagetype, KE ke, C3151Hj0 c3151Hj0) throws IOException {
            int i = 0;
            AbstractC8616os abstractC8616os = null;
            h<?, ?> hVar = null;
            while (true) {
                int Y = ke.Y();
                if (Y == 0) {
                    break;
                } else if (Y == IM2.s) {
                    i = ke.Z();
                    if (i != 0) {
                        hVar = c3151Hj0.c(messagetype, i);
                    }
                } else if (Y == IM2.t) {
                    if (i != 0 && hVar != null) {
                        y2(ke, hVar, c3151Hj0, i);
                        abstractC8616os = null;
                    } else {
                        abstractC8616os = ke.x();
                    }
                } else if (!ke.g0(Y)) {
                    break;
                }
            }
            ke.a(IM2.r);
            if (abstractC8616os != null && i != 0) {
                if (hVar != null) {
                    E2(abstractC8616os, c3151Hj0, hVar);
                } else {
                    O1(i, abstractC8616os);
                }
            }
        }

        public e<MessageType, BuilderType>.a G2() {
            return new a(this, false, null);
        }

        public e<MessageType, BuilderType>.a H2() {
            return new a(this, true, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean I2(KE ke, C3151Hj0 c3151Hj0, h<?, ?> hVar, int i, int i2) throws IOException {
            boolean z;
            boolean z2;
            InterfaceC3540Li1.a aVar;
            Object build;
            InterfaceC3540Li1 interfaceC3540Li1;
            int b = IM2.b(i);
            if (hVar != null) {
                if (b == C11040yo0.A(hVar.d.y3(), false)) {
                    z2 = false;
                    z = false;
                } else {
                    g gVar = hVar.d;
                    if (gVar.Y0 && gVar.Z.h() && b == C11040yo0.A(hVar.d.y3(), true)) {
                        z = true;
                        z2 = false;
                    }
                }
                if (!z2) {
                    return v2(i, ke);
                }
                z2();
                if (z) {
                    int t = ke.t(ke.N());
                    if (hVar.d.y3() == IM2.b.k1) {
                        while (ke.f() > 0) {
                            Object a2 = hVar.d.Z0().a(ke.z());
                            if (a2 == null) {
                                return true;
                            }
                            this.extensions.h(hVar.d, hVar.j(a2));
                        }
                    } else {
                        while (ke.f() > 0) {
                            this.extensions.h(hVar.d, C11040yo0.N(ke, hVar.d.y3(), false));
                        }
                    }
                    ke.s(t);
                } else {
                    int i3 = a.a[hVar.d.z5().ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            build = C11040yo0.N(ke, hVar.d.y3(), false);
                        } else {
                            int z3 = ke.z();
                            Object a3 = hVar.d.Z0().a(z3);
                            if (a3 == null) {
                                Q1(i2, z3);
                                return true;
                            }
                            build = a3;
                        }
                    } else {
                        if (!hVar.d.g3() && (interfaceC3540Li1 = (InterfaceC3540Li1) this.extensions.u(hVar.d)) != null) {
                            aVar = interfaceC3540Li1.x();
                        } else {
                            aVar = null;
                        }
                        if (aVar == null) {
                            aVar = hVar.c().k0();
                        }
                        if (hVar.d.y3() == IM2.b.g1) {
                            ke.E(hVar.d(), aVar, c3151Hj0);
                        } else {
                            ke.I(aVar, c3151Hj0);
                        }
                        build = aVar.build();
                    }
                    if (hVar.d.g3()) {
                        this.extensions.h(hVar.d, hVar.j(build));
                    } else {
                        this.extensions.O(hVar.d, hVar.j(build));
                    }
                }
                return true;
            }
            z2 = true;
            z = false;
            if (!z2) {
            }
        }

        public <MessageType extends InterfaceC3540Li1> boolean J2(MessageType messagetype, KE ke, C3151Hj0 c3151Hj0, int i) throws IOException {
            int a2 = IM2.a(i);
            return I2(ke, c3151Hj0, c3151Hj0.c(messagetype, a2), i, a2);
        }

        public <MessageType extends InterfaceC3540Li1> boolean K2(MessageType messagetype, KE ke, C3151Hj0 c3151Hj0, int i) throws IOException {
            if (i == IM2.q) {
                F2(messagetype, ke, c3151Hj0);
                return true;
            } else if (IM2.b(i) == 2) {
                return J2(messagetype, ke, c3151Hj0, i);
            } else {
                return ke.g0(i);
            }
        }

        @Override // o.IC0.f
        public final <Type> boolean Q0(AbstractC2955Fj0<MessageType, Type> abstractC2955Fj0) {
            h<MessageType, ?> t1 = IC0.t1(abstractC2955Fj0);
            L2(t1);
            return this.extensions.B(t1.d);
        }

        @Override // o.IC0.f
        public final <Type> int V(AbstractC2955Fj0<MessageType, List<Type>> abstractC2955Fj0) {
            h<MessageType, ?> t1 = IC0.t1(abstractC2955Fj0);
            L2(t1);
            return this.extensions.y(t1.d);
        }

        @Override // o.IC0, o.InterfaceC3540Li1
        public /* bridge */ /* synthetic */ InterfaceC3540Li1.a k0() {
            return super.k0();
        }

        @Override // o.IC0.f
        public final <Type> Type n0(AbstractC2955Fj0<MessageType, List<Type>> abstractC2955Fj0, int i) {
            h<MessageType, ?> t1 = IC0.t1(abstractC2955Fj0);
            L2(t1);
            return (Type) t1.i(this.extensions.x(t1.d, i));
        }

        @Override // o.IC0, o.InterfaceC3637Mi1
        public /* bridge */ /* synthetic */ InterfaceC3540Li1 u0() {
            return super.u0();
        }

        @Override // o.IC0, o.InterfaceC3540Li1
        public /* bridge */ /* synthetic */ InterfaceC3540Li1.a x() {
            return super.x();
        }

        public final void y2(KE ke, h<?, ?> hVar, C3151Hj0 c3151Hj0, int i) throws IOException {
            I2(ke, c3151Hj0, hVar, IM2.c(i, 2), i);
        }

        @Override // o.IC0.f
        public final <Type> Type z0(AbstractC2955Fj0<MessageType, Type> abstractC2955Fj0) {
            h<MessageType, ?> t1 = IC0.t1(abstractC2955Fj0);
            L2(t1);
            Object u = this.extensions.u(t1.d);
            if (u == null) {
                return t1.b;
            }
            return (Type) t1.g(u);
        }

        public C11040yo0<g> z2() {
            if (this.extensions.D()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }
    }

    /* loaded from: classes.dex */
    public interface f<MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends InterfaceC3637Mi1 {
        <Type> boolean Q0(AbstractC2955Fj0<MessageType, Type> abstractC2955Fj0);

        <Type> int V(AbstractC2955Fj0<MessageType, List<Type>> abstractC2955Fj0);

        <Type> Type n0(AbstractC2955Fj0<MessageType, List<Type>> abstractC2955Fj0, int i);

        <Type> Type z0(AbstractC2955Fj0<MessageType, Type> abstractC2955Fj0);
    }

    /* loaded from: classes.dex */
    public static final class g implements C11040yo0.c<g> {
        public final C9740tS0.d<?> X;
        public final int Y;
        public final boolean Y0;
        public final IM2.b Z;
        public final boolean Z0;

        public g(C9740tS0.d<?> dVar, int i, IM2.b bVar, boolean z, boolean z2) {
            this.X = dVar;
            this.Y = i;
            this.Z = bVar;
            this.Y0 = z;
            this.Z0 = z2;
        }

        @Override // o.C11040yo0.c
        public boolean A5() {
            return this.Z0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.C11040yo0.c
        public InterfaceC3540Li1.a G3(InterfaceC3540Li1.a aVar, InterfaceC3540Li1 interfaceC3540Li1) {
            return ((b) aVar).U1((IC0) interfaceC3540Li1);
        }

        @Override // o.C11040yo0.c
        public C9740tS0.d<?> Z0() {
            return this.X;
        }

        @Override // java.lang.Comparable
        /* renamed from: e */
        public int compareTo(g gVar) {
            return this.Y - gVar.Y;
        }

        @Override // o.C11040yo0.c
        public boolean g3() {
            return this.Y0;
        }

        @Override // o.C11040yo0.c
        public int k() {
            return this.Y;
        }

        @Override // o.C11040yo0.c
        public IM2.b y3() {
            return this.Z;
        }

        @Override // o.C11040yo0.c
        public IM2.c z5() {
            return this.Z.e();
        }
    }

    /* loaded from: classes.dex */
    public static class h<ContainingType extends InterfaceC3540Li1, Type> extends AbstractC2955Fj0<ContainingType, Type> {
        public final ContainingType a;
        public final Type b;
        public final InterfaceC3540Li1 c;
        public final g d;

        public h(ContainingType containingtype, Type type, InterfaceC3540Li1 interfaceC3540Li1, g gVar, Class cls) {
            if (containingtype != null) {
                if (gVar.y3() == IM2.b.h1 && interfaceC3540Li1 == null) {
                    throw new IllegalArgumentException("Null messageDefaultInstance");
                }
                this.a = containingtype;
                this.b = type;
                this.c = interfaceC3540Li1;
                this.d = gVar;
                return;
            }
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }

        @Override // o.AbstractC2955Fj0
        public Type a() {
            return this.b;
        }

        @Override // o.AbstractC2955Fj0
        public IM2.b b() {
            return this.d.y3();
        }

        @Override // o.AbstractC2955Fj0
        public InterfaceC3540Li1 c() {
            return this.c;
        }

        @Override // o.AbstractC2955Fj0
        public int d() {
            return this.d.k();
        }

        @Override // o.AbstractC2955Fj0
        public boolean f() {
            return this.d.Y0;
        }

        public Object g(Object obj) {
            if (this.d.g3()) {
                if (this.d.z5() == IM2.c.ENUM) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : (List) obj) {
                        arrayList.add(i(obj2));
                    }
                    return arrayList;
                }
                return obj;
            }
            return i(obj);
        }

        public ContainingType h() {
            return this.a;
        }

        public Object i(Object obj) {
            if (this.d.z5() == IM2.c.ENUM) {
                return this.d.X.a(((Integer) obj).intValue());
            }
            return obj;
        }

        public Object j(Object obj) {
            if (this.d.z5() == IM2.c.ENUM) {
                return Integer.valueOf(((C9740tS0.c) obj).k());
            }
            return obj;
        }

        public Object k(Object obj) {
            if (this.d.g3()) {
                if (this.d.z5() == IM2.c.ENUM) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : (List) obj) {
                        arrayList.add(j(obj2));
                    }
                    return arrayList;
                }
                return obj;
            }
            return j(obj);
        }
    }

    /* loaded from: classes.dex */
    public enum i {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* loaded from: classes.dex */
    public static final class j implements Serializable {
        private static final long serialVersionUID = 0;
        public final Class<?> X;
        public final String Y;
        public final byte[] Z;

        public j(InterfaceC3540Li1 interfaceC3540Li1) {
            Class<?> cls = interfaceC3540Li1.getClass();
            this.X = cls;
            this.Y = cls.getName();
            this.Z = interfaceC3540Li1.p();
        }

        public static j a(InterfaceC3540Li1 interfaceC3540Li1) {
            return new j(interfaceC3540Li1);
        }

        @Deprecated
        public final Object b() throws ObjectStreamException {
            try {
                Field declaredField = c().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((InterfaceC3540Li1) declaredField.get(null)).k0().D3(this.Z).i2();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.Y, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Unable to call parsePartialFrom", e2);
            } catch (NoSuchFieldException e3) {
                throw new RuntimeException("Unable to find defaultInstance in " + this.Y, e3);
            } catch (SecurityException e4) {
                throw new RuntimeException("Unable to call defaultInstance in " + this.Y, e4);
            } catch (C9258rT0 e5) {
                throw new RuntimeException("Unable to understand proto buffer", e5);
            }
        }

        public final Class<?> c() throws ClassNotFoundException {
            Class<?> cls = this.X;
            if (cls != null) {
                return cls;
            }
            return Class.forName(this.Y);
        }

        public Object readResolve() throws ObjectStreamException {
            try {
                Field declaredField = c().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((InterfaceC3540Li1) declaredField.get(null)).k0().D3(this.Z).i2();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.Y, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Unable to call parsePartialFrom", e2);
            } catch (NoSuchFieldException unused) {
                return b();
            } catch (SecurityException e3) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.Y, e3);
            } catch (C9258rT0 e4) {
                throw new RuntimeException("Unable to understand proto buffer", e4);
            }
        }
    }

    public static C9740tS0.a B1() {
        return C3170Ho.i();
    }

    public static C9740tS0.b C1() {
        return X40.i();
    }

    public static C9740tS0.f D1() {
        return C6413fv0.i();
    }

    public static C9740tS0.g E1() {
        return C6299fR0.i();
    }

    public static C9740tS0.i F1() {
        return B41.i();
    }

    public static <E> C9740tS0.k<E> G1() {
        return YJ1.f();
    }

    public static <T extends IC0<?, ?>> T I1(Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t == null) {
            T t2 = (T) ((IC0) TB2.j(cls)).u0();
            if (t2 != null) {
                defaultInstanceMap.put(cls, t2);
                return t2;
            }
            throw new IllegalStateException();
        }
        return t;
    }

    public static Method K1(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e2);
        }
    }

    public static Object L1(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final <T extends IC0<T, ?>> boolean M1(T t, boolean z) {
        Object obj;
        byte byteValue = ((Byte) t.y1(i.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e2 = XJ1.a().j(t).e(t);
        if (z) {
            i iVar = i.SET_MEMOIZED_IS_INITIALIZED;
            if (e2) {
                obj = t;
            } else {
                obj = null;
            }
            t.z1(iVar, obj);
        }
        return e2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [o.tS0$a] */
    public static C9740tS0.a R1(C9740tS0.a aVar) {
        int i2;
        int size = aVar.size();
        if (size == 0) {
            i2 = 10;
        } else {
            i2 = size * 2;
        }
        return aVar.o(i2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [o.tS0$b] */
    public static C9740tS0.b S1(C9740tS0.b bVar) {
        int i2;
        int size = bVar.size();
        if (size == 0) {
            i2 = 10;
        } else {
            i2 = size * 2;
        }
        return bVar.o(i2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [o.tS0$f] */
    public static C9740tS0.f T1(C9740tS0.f fVar) {
        int i2;
        int size = fVar.size();
        if (size == 0) {
            i2 = 10;
        } else {
            i2 = size * 2;
        }
        return fVar.o(i2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [o.tS0$g] */
    public static C9740tS0.g U1(C9740tS0.g gVar) {
        int i2;
        int size = gVar.size();
        if (size == 0) {
            i2 = 10;
        } else {
            i2 = size * 2;
        }
        return gVar.o(i2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [o.tS0$i] */
    public static C9740tS0.i V1(C9740tS0.i iVar) {
        int i2;
        int size = iVar.size();
        if (size == 0) {
            i2 = 10;
        } else {
            i2 = size * 2;
        }
        return iVar.o(i2);
    }

    public static <E> C9740tS0.k<E> W1(C9740tS0.k<E> kVar) {
        int i2;
        int size = kVar.size();
        if (size == 0) {
            i2 = 10;
        } else {
            i2 = size * 2;
        }
        return kVar.o(i2);
    }

    public static Object Y1(InterfaceC3540Li1 interfaceC3540Li1, String str, Object[] objArr) {
        return new C7513kO1(interfaceC3540Li1, str, objArr);
    }

    public static <ContainingType extends InterfaceC3540Li1, Type> h<ContainingType, Type> Z1(ContainingType containingtype, InterfaceC3540Li1 interfaceC3540Li1, C9740tS0.d<?> dVar, int i2, IM2.b bVar, boolean z, Class cls) {
        return new h<>(containingtype, Collections.EMPTY_LIST, interfaceC3540Li1, new g(dVar, i2, bVar, true, z), cls);
    }

    public static <ContainingType extends InterfaceC3540Li1, Type> h<ContainingType, Type> a2(ContainingType containingtype, Type type, InterfaceC3540Li1 interfaceC3540Li1, C9740tS0.d<?> dVar, int i2, IM2.b bVar, Class cls) {
        return new h<>(containingtype, type, interfaceC3540Li1, new g(dVar, i2, bVar, false, false), cls);
    }

    public static <T extends IC0<T, ?>> T b2(T t, InputStream inputStream) throws C9258rT0 {
        return (T) u1(p2(t, inputStream, C3151Hj0.d()));
    }

    public static <T extends IC0<T, ?>> T c2(T t, InputStream inputStream, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (T) u1(p2(t, inputStream, c3151Hj0));
    }

    public static <T extends IC0<T, ?>> T d2(T t, InputStream inputStream) throws C9258rT0 {
        return (T) u1(s2(t, KE.j(inputStream), C3151Hj0.d()));
    }

    public static <T extends IC0<T, ?>> T e2(T t, InputStream inputStream, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (T) u1(s2(t, KE.j(inputStream), c3151Hj0));
    }

    public static <T extends IC0<T, ?>> T f2(T t, ByteBuffer byteBuffer) throws C9258rT0 {
        return (T) g2(t, byteBuffer, C3151Hj0.d());
    }

    public static <T extends IC0<T, ?>> T g2(T t, ByteBuffer byteBuffer, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (T) u1(m2(t, KE.n(byteBuffer), c3151Hj0));
    }

    public static <T extends IC0<T, ?>> T h2(T t, AbstractC8616os abstractC8616os) throws C9258rT0 {
        return (T) u1(j2(t, abstractC8616os, C3151Hj0.d()));
    }

    public static <T extends IC0<T, ?>> T j2(T t, AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (T) u1(q2(t, abstractC8616os, c3151Hj0));
    }

    public static <T extends IC0<T, ?>> T k2(T t, KE ke) throws C9258rT0 {
        return (T) m2(t, ke, C3151Hj0.d());
    }

    public static <T extends IC0<T, ?>> T m2(T t, KE ke, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (T) u1(s2(t, ke, c3151Hj0));
    }

    public static <T extends IC0<T, ?>> T n2(T t, byte[] bArr) throws C9258rT0 {
        return (T) u1(t2(t, bArr, 0, bArr.length, C3151Hj0.d()));
    }

    public static <T extends IC0<T, ?>> T o2(T t, byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (T) u1(t2(t, bArr, 0, bArr.length, c3151Hj0));
    }

    public static <T extends IC0<T, ?>> T p2(T t, InputStream inputStream, C3151Hj0 c3151Hj0) throws C9258rT0 {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            KE j2 = KE.j(new AbstractC5713d2.a.C0266a(inputStream, KE.O(read, inputStream)));
            T t2 = (T) s2(t, j2, c3151Hj0);
            try {
                j2.a(0);
                return t2;
            } catch (C9258rT0 e2) {
                throw e2.j(t2);
            }
        } catch (IOException e3) {
            throw new C9258rT0(e3.getMessage());
        }
    }

    public static <T extends IC0<T, ?>> T q2(T t, AbstractC8616os abstractC8616os, C3151Hj0 c3151Hj0) throws C9258rT0 {
        KE d0 = abstractC8616os.d0();
        T t2 = (T) s2(t, d0, c3151Hj0);
        try {
            d0.a(0);
            return t2;
        } catch (C9258rT0 e2) {
            throw e2.j(t2);
        }
    }

    public static <T extends IC0<T, ?>> T r2(T t, KE ke) throws C9258rT0 {
        return (T) s2(t, ke, C3151Hj0.d());
    }

    public static <T extends IC0<T, ?>> T s2(T t, KE ke, C3151Hj0 c3151Hj0) throws C9258rT0 {
        T t2 = (T) t.y1(i.NEW_MUTABLE_INSTANCE);
        try {
            InterfaceC9026qY1 j2 = XJ1.a().j(t2);
            j2.i(t2, LE.S(ke), c3151Hj0);
            j2.d(t2);
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof C9258rT0) {
                throw ((C9258rT0) e2.getCause());
            }
            throw new C9258rT0(e2.getMessage()).j(t2);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof C9258rT0) {
                throw ((C9258rT0) e3.getCause());
            }
            throw e3;
        }
    }

    public static <MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>, T> h<MessageType, T> t1(AbstractC2955Fj0<MessageType, T> abstractC2955Fj0) {
        if (abstractC2955Fj0.e()) {
            return (h) abstractC2955Fj0;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    public static <T extends IC0<T, ?>> T t2(T t, byte[] bArr, int i2, int i3, C3151Hj0 c3151Hj0) throws C9258rT0 {
        T t2 = (T) t.y1(i.NEW_MUTABLE_INSTANCE);
        try {
            InterfaceC9026qY1 j2 = XJ1.a().j(t2);
            j2.c(t2, bArr, i2, i2 + i3, new C6842he.b(c3151Hj0));
            j2.d(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof C9258rT0) {
                throw ((C9258rT0) e2.getCause());
            }
            throw new C9258rT0(e2.getMessage()).j(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw C9258rT0.l().j(t2);
        }
    }

    public static <T extends IC0<T, ?>> T u1(T t) throws C9258rT0 {
        if (t != null && !t.isInitialized()) {
            throw t.H0().a().j(t);
        }
        return t;
    }

    public static <T extends IC0<T, ?>> T u2(T t, byte[] bArr, C3151Hj0 c3151Hj0) throws C9258rT0 {
        return (T) u1(t2(t, bArr, 0, bArr.length, c3151Hj0));
    }

    public static <T extends IC0<?, ?>> void w2(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    public abstract Object A1(i iVar, Object obj, Object obj2);

    @Override // o.AbstractC5713d2
    public int B0() {
        return this.memoizedSerializedSize;
    }

    public final void H1() {
        if (this.unknownFields == C10888yA2.e()) {
            this.unknownFields = C10888yA2.p();
        }
    }

    @Override // o.InterfaceC3637Mi1
    /* renamed from: J1 */
    public final MessageType u0() {
        return (MessageType) y1(i.GET_DEFAULT_INSTANCE);
    }

    @Override // o.InterfaceC3540Li1
    public int N() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = XJ1.a().j(this).g(this);
        }
        return this.memoizedSerializedSize;
    }

    public void N1() {
        XJ1.a().j(this).d(this);
    }

    public void O1(int i2, AbstractC8616os abstractC8616os) {
        H1();
        this.unknownFields.m(i2, abstractC8616os);
    }

    public final void P1(C10888yA2 c10888yA2) {
        this.unknownFields = C10888yA2.o(this.unknownFields, c10888yA2);
    }

    public void Q1(int i2, int i3) {
        H1();
        this.unknownFields.n(i2, i3);
    }

    @Override // o.InterfaceC3540Li1
    /* renamed from: X1 */
    public final BuilderType k0() {
        return (BuilderType) y1(i.NEW_BUILDER);
    }

    @Override // o.AbstractC5713d2
    public void Z0(int i2) {
        this.memoizedSerializedSize = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!u0().getClass().isInstance(obj)) {
            return false;
        }
        return XJ1.a().j(this).j(this, (IC0) obj);
    }

    public int hashCode() {
        int i2 = this.memoizedHashCode;
        if (i2 != 0) {
            return i2;
        }
        int h2 = XJ1.a().j(this).h(this);
        this.memoizedHashCode = h2;
        return h2;
    }

    @Override // o.InterfaceC3637Mi1
    public final boolean isInitialized() {
        return M1(this, true);
    }

    @Override // o.InterfaceC3540Li1
    public final InterfaceC3892Oy1<MessageType> k1() {
        return (InterfaceC3892Oy1) y1(i.GET_PARSER);
    }

    @Override // o.InterfaceC3540Li1
    public void r0(ME me) throws IOException {
        XJ1.a().j(this).f(this, NE.T(me));
    }

    public Object s1() throws Exception {
        return y1(i.BUILD_MESSAGE_INFO);
    }

    public String toString() {
        return C3735Ni1.e(this, super.toString());
    }

    public final <MessageType extends IC0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType v1() {
        return (BuilderType) y1(i.NEW_BUILDER);
    }

    public boolean v2(int i2, KE ke) throws IOException {
        if (IM2.b(i2) == 4) {
            return false;
        }
        H1();
        return this.unknownFields.k(i2, ke);
    }

    public final <MessageType extends IC0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType w1(MessageType messagetype) {
        return (BuilderType) v1().U1(messagetype);
    }

    @Override // o.InterfaceC3540Li1
    /* renamed from: x2 */
    public final BuilderType x() {
        BuilderType buildertype = (BuilderType) y1(i.NEW_BUILDER);
        buildertype.U1(this);
        return buildertype;
    }

    public Object y1(i iVar) {
        return A1(iVar, null, null);
    }

    public Object z1(i iVar, Object obj) {
        return A1(iVar, obj, null);
    }
}
