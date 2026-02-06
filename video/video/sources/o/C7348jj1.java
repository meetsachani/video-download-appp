package o;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import o.InterfaceC4410Ug1;
import o.InterfaceC7583kh1;

@Deprecated
/* renamed from: o.jj1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7348jj1 {

    /* renamed from: o.jj1$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public static final int e = 0;
        public static final int f = 1;
        public static final int g = 2;
        public static final int h = 3;
        public final InterfaceC7583kh1.a a;
        public final HandlerThread b;
        public final InterfaceC5285bG0 c;
        public final D22<C10079ur2> d;

        /* renamed from: o.jj1$b$a */
        /* loaded from: classes2.dex */
        public final class a implements Handler.Callback {
            public static final int Z0 = 100;
            public final C0294a X = new C0294a();
            public InterfaceC7583kh1 Y;
            public InterfaceC4410Ug1 Z;

            /* renamed from: o.jj1$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public final class C0294a implements InterfaceC7583kh1.c {
                public final C0295a X = new C0295a();
                public final InterfaceC10877y8 Y = new CW(true, 65536);
                public boolean Z;

                /* renamed from: o.jj1$b$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public final class C0295a implements InterfaceC4410Ug1.a {
                    public C0295a() {
                    }

                    @Override // o.G02.a
                    /* renamed from: a */
                    public void l(InterfaceC4410Ug1 interfaceC4410Ug1) {
                        b.this.c.c(2).a();
                    }

                    @Override // o.InterfaceC4410Ug1.a
                    public void j(InterfaceC4410Ug1 interfaceC4410Ug1) {
                        b.this.d.B(interfaceC4410Ug1.q());
                        b.this.c.c(3).a();
                    }
                }

                public C0294a() {
                }

                @Override // o.InterfaceC7583kh1.c
                public void L(InterfaceC7583kh1 interfaceC7583kh1, AbstractC7373jp2 abstractC7373jp2) {
                    if (this.Z) {
                        return;
                    }
                    this.Z = true;
                    a.this.Z = interfaceC7583kh1.h(new InterfaceC7583kh1.b(abstractC7373jp2.t(0)), this.Y, 0L);
                    a.this.Z.o(this.X, 0L);
                }
            }

            public a() {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i = message.what;
                if (i == 0) {
                    InterfaceC7583kh1 e = b.this.a.e((C8322nf1) message.obj);
                    this.Y = e;
                    e.G(this.X, null, ND1.b);
                    b.this.c.m(1);
                    return true;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return false;
                        }
                        if (this.Z != null) {
                            ((InterfaceC7583kh1) C9542sf.g(this.Y)).s(this.Z);
                        }
                        ((InterfaceC7583kh1) C9542sf.g(this.Y)).u(this.X);
                        b.this.c.g(null);
                        b.this.b.quit();
                        return true;
                    }
                    ((InterfaceC4410Ug1) C9542sf.g(this.Z)).d(0L);
                    return true;
                } else {
                    try {
                        InterfaceC4410Ug1 interfaceC4410Ug1 = this.Z;
                        if (interfaceC4410Ug1 == null) {
                            ((InterfaceC7583kh1) C9542sf.g(this.Y)).Q();
                        } else {
                            interfaceC4410Ug1.m();
                        }
                        b.this.c.a(1, 100);
                    } catch (Exception e2) {
                        b.this.d.C(e2);
                        b.this.c.c(3).a();
                    }
                    return true;
                }
            }
        }

        public b(InterfaceC7583kh1.a aVar, LD ld) {
            this.a = aVar;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:MetadataRetriever");
            this.b = handlerThread;
            handlerThread.start();
            this.c = ld.d(handlerThread.getLooper(), new a());
            this.d = D22.F();
        }

        public InterfaceFutureC8411o11<C10079ur2> e(C8322nf1 c8322nf1) {
            this.c.f(0, c8322nf1).a();
            return this.d;
        }
    }

    public static InterfaceFutureC8411o11<C10079ur2> a(Context context, C8322nf1 c8322nf1) {
        return b(context, c8322nf1, LD.a);
    }

    @InterfaceC5056aJ2
    public static InterfaceFutureC8411o11<C10079ur2> b(Context context, C8322nf1 c8322nf1, LD ld) {
        return d(new JZ(context, new ZY().q(6)), c8322nf1, ld);
    }

    public static InterfaceFutureC8411o11<C10079ur2> c(InterfaceC7583kh1.a aVar, C8322nf1 c8322nf1) {
        return d(aVar, c8322nf1, LD.a);
    }

    public static InterfaceFutureC8411o11<C10079ur2> d(InterfaceC7583kh1.a aVar, C8322nf1 c8322nf1, LD ld) {
        return new b(aVar, ld).e(c8322nf1);
    }
}
