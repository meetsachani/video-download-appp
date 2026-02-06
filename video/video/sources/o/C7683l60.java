package o;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: o.l60  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7683l60 {
    public static final int m = 4096;
    public static final long n = 2000;

    /* renamed from: o  reason: collision with root package name */
    public static final long f795o = 65536;
    public final C5730d60 a;
    public HandlerC6025eJ1 b;
    public long c;
    public long d;
    public InputStream e;
    public InterfaceC6146ep0 f;
    public InterfaceC9457sI0 g;
    public long h;
    public int i;
    public String j;
    public boolean k;
    public String l;

    public C7683l60(C5730d60 c5730d60) {
        this.a = c5730d60;
    }

    public static C7683l60 d(C5730d60 c5730d60) {
        return new C7683l60(c5730d60);
    }

    public final boolean a(C5002a60 c5002a60) throws IOException, IllegalAccessException {
        if (this.i != 416 && !h(c5002a60)) {
            return false;
        }
        if (c5002a60 != null) {
            j();
        }
        f();
        this.a.J(0L);
        this.a.V(0L);
        InterfaceC9457sI0 c = BI.d().c();
        this.g = c;
        c.H0(this.a);
        InterfaceC9457sI0 d = C5279bE2.d(this.g, this.a);
        this.g = d;
        this.i = d.E0();
        return true;
    }

    public final void b(InterfaceC6146ep0 interfaceC6146ep0) {
        InterfaceC9457sI0 interfaceC9457sI0 = this.g;
        if (interfaceC9457sI0 != null) {
            try {
                interfaceC9457sI0.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        InputStream inputStream = this.e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        if (interfaceC6146ep0 != null) {
            try {
                try {
                    n(interfaceC6146ep0);
                } catch (Throwable th) {
                    try {
                        interfaceC6146ep0.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    throw th;
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        if (interfaceC6146ep0 != null) {
            try {
                interfaceC6146ep0.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
    }

    public final String c(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        if (inputStream != null) {
            BufferedReader bufferedReader = null;
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        } catch (IOException unused) {
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return sb.toString();
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException | NullPointerException unused2) {
                                }
                            }
                            throw th;
                        }
                    }
                    bufferedReader2.close();
                } catch (IOException unused3) {
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException | NullPointerException unused4) {
            }
        }
        return sb.toString();
    }

    public final void e() {
        C5002a60 c5002a60 = new C5002a60();
        c5002a60.m(this.a.r());
        c5002a60.p(this.a.E());
        c5002a60.k(this.j);
        c5002a60.i(this.a.q());
        c5002a60.l(this.a.t());
        c5002a60.j(this.a.s());
        c5002a60.o(this.h);
        c5002a60.n(System.currentTimeMillis());
        BI.d().b().b(c5002a60);
    }

    public final void f() {
        File file = new File(this.l);
        if (file.exists()) {
            file.delete();
        }
    }

    public final C5002a60 g() {
        return BI.d().b().c(this.a.r());
    }

    public final boolean h(C5002a60 c5002a60) {
        if (this.j != null && c5002a60 != null && c5002a60.c() != null && !c5002a60.c().equals(this.j)) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        int i = this.i;
        if (i >= 200 && i < 300) {
            return true;
        }
        return false;
    }

    public final void j() {
        BI.d().b().remove(this.a.r());
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0228 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:10:0x0022, B:12:0x002a, B:19:0x0041, B:21:0x0063, B:23:0x0069, B:24:0x007c, B:25:0x008a, B:27:0x00a1, B:30:0x00aa, B:32:0x00b2, B:33:0x00b6, B:37:0x00d8, B:39:0x00de, B:40:0x0105, B:42:0x0114, B:43:0x0117, B:45:0x011d, B:46:0x012a, B:49:0x0130, B:50:0x0133, B:52:0x013b, B:53:0x0140, B:55:0x0148, B:56:0x014d, B:58:0x0164, B:60:0x016a, B:62:0x0174, B:64:0x017e, B:65:0x0182, B:66:0x0185, B:68:0x018f, B:70:0x0199, B:71:0x01a4, B:73:0x01ac, B:74:0x01b1, B:76:0x01b9, B:77:0x01be, B:79:0x01c8, B:81:0x01e4, B:82:0x01e9, B:84:0x020b, B:85:0x0210, B:87:0x021a, B:89:0x0224, B:91:0x0228, B:92:0x022b), top: B:96:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ET1 k() {
        ET1 et1 = new ET1();
        EnumC4101Rc2 B = this.a.B();
        EnumC4101Rc2 enumC4101Rc2 = EnumC4101Rc2.CANCELLED;
        if (B == enumC4101Rc2) {
            et1.e(true);
            return et1;
        }
        EnumC4101Rc2 B2 = this.a.B();
        EnumC4101Rc2 enumC4101Rc22 = EnumC4101Rc2.PAUSED;
        try {
            if (B2 == enumC4101Rc22) {
                et1.g(true);
                return et1;
            }
            try {
                if (this.a.w() != null) {
                    this.b = new HandlerC6025eJ1(this.a.w());
                }
                this.l = C5279bE2.e(this.a.q(), this.a.t());
                File file = new File(this.l);
                C5002a60 g = g();
                C5002a60 c5002a60 = null;
                if (g != null) {
                    if (file.exists()) {
                        this.a.V(g.g());
                        this.a.J(g.b());
                    } else {
                        j();
                        this.a.J(0L);
                        this.a.V(0L);
                        g = null;
                    }
                }
                InterfaceC9457sI0 c = BI.d().c();
                this.g = c;
                c.H0(this.a);
                if (this.a.B() == enumC4101Rc2) {
                    et1.e(true);
                } else if (this.a.B() == enumC4101Rc22) {
                    et1.g(true);
                } else {
                    InterfaceC9457sI0 d = C5279bE2.d(this.g, this.a);
                    this.g = d;
                    this.i = d.E0();
                    this.j = this.g.Z0("ETag");
                    if (!a(g)) {
                        c5002a60 = g;
                    }
                    if (!i()) {
                        C7327je0 c7327je0 = new C7327je0();
                        c7327je0.k(true);
                        c7327je0.l(c(this.g.G0()));
                        c7327je0.i(this.g.T1());
                        c7327je0.j(this.i);
                        et1.f(c7327je0);
                    } else {
                        m();
                        this.h = this.a.D();
                        if (!this.k) {
                            f();
                        }
                        if (this.h == 0) {
                            long contentLength = this.g.getContentLength();
                            this.h = contentLength;
                            this.a.V(contentLength);
                        }
                        if (this.k && c5002a60 == null) {
                            e();
                        }
                        if (this.a.B() == enumC4101Rc2) {
                            et1.e(true);
                        } else if (this.a.B() == enumC4101Rc22) {
                            et1.g(true);
                        } else {
                            this.a.j();
                            this.e = this.g.P3();
                            byte[] bArr = new byte[4096];
                            if (!file.exists()) {
                                if (file.getParentFile() != null && !file.getParentFile().exists()) {
                                    if (file.getParentFile().mkdirs()) {
                                        file.createNewFile();
                                    }
                                } else {
                                    file.createNewFile();
                                }
                            }
                            this.f = C6389fp0.c(file);
                            if (this.k && this.a.s() != 0) {
                                this.f.seek(this.a.s());
                            }
                            if (this.a.B() == enumC4101Rc2) {
                                et1.e(true);
                            } else if (this.a.B() != enumC4101Rc22) {
                                while (true) {
                                    int read = this.e.read(bArr, 0, 4096);
                                    if (read == -1) {
                                        C5279bE2.h(this.l, C5279bE2.c(this.a.q(), this.a.t()));
                                        et1.h(true);
                                        if (this.k) {
                                            j();
                                        }
                                    } else {
                                        this.f.write(bArr, 0, read);
                                        C5730d60 c5730d60 = this.a;
                                        c5730d60.J(c5730d60.s() + read);
                                        l();
                                        o(this.f);
                                        if (this.a.B() == EnumC4101Rc2.CANCELLED) {
                                            et1.e(true);
                                            break;
                                        } else if (this.a.B() == EnumC4101Rc2.PAUSED) {
                                            n(this.f);
                                            et1.g(true);
                                            break;
                                        }
                                    }
                                }
                            } else {
                                et1.g(true);
                            }
                        }
                    }
                }
            } catch (IOException e) {
                e = e;
                if (!this.k) {
                    f();
                }
                C7327je0 c7327je02 = new C7327je0();
                c7327je02.g(true);
                c7327je02.h(e);
                et1.f(c7327je02);
                b(this.f);
                return et1;
            } catch (IllegalAccessException e2) {
                e = e2;
                if (!this.k) {
                }
                C7327je0 c7327je022 = new C7327je0();
                c7327je022.g(true);
                c7327je022.h(e);
                et1.f(c7327je022);
                b(this.f);
                return et1;
            }
            b(this.f);
            return et1;
        } catch (Throwable th) {
            b(this.f);
            throw th;
        }
    }

    public final void l() {
        HandlerC6025eJ1 handlerC6025eJ1;
        if (this.a.B() != EnumC4101Rc2.CANCELLED && (handlerC6025eJ1 = this.b) != null) {
            handlerC6025eJ1.obtainMessage(1, new C5783dJ1(this.a.s(), this.h)).sendToTarget();
        }
    }

    public final void m() {
        boolean z;
        if (this.i == 206) {
            z = true;
        } else {
            z = false;
        }
        this.k = z;
    }

    public final void n(InterfaceC6146ep0 interfaceC6146ep0) {
        try {
            interfaceC6146ep0.b();
            if (this.k) {
                BI.d().b().d(this.a.r(), this.a.s(), System.currentTimeMillis());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final void o(InterfaceC6146ep0 interfaceC6146ep0) {
        long s = this.a.s();
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.c;
        if (s - this.d > 65536 && j > 2000) {
            n(interfaceC6146ep0);
            this.d = s;
            this.c = currentTimeMillis;
        }
    }
}
