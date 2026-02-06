package o;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import o.FU;

@Deprecated
/* renamed from: o.Yo0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4829Yo0 extends AbstractC5887dl {
    @InterfaceC11300zs1
    public RandomAccessFile f;
    @InterfaceC11300zs1
    public Uri g;
    public long h;
    public boolean i;

    @ES1(21)
    /* renamed from: o.Yo0$a */
    /* loaded from: classes2.dex */
    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        @K40
        public static boolean b(@InterfaceC11300zs1 Throwable th) {
            if ((th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.Yo0$b */
    /* loaded from: classes2.dex */
    public static final class b implements FU.a {
        @InterfaceC11300zs1
        public InterfaceC4261Sr2 a;

        @Override // o.FU.a
        /* renamed from: c */
        public C4829Yo0 a() {
            C4829Yo0 c4829Yo0 = new C4829Yo0();
            InterfaceC4261Sr2 interfaceC4261Sr2 = this.a;
            if (interfaceC4261Sr2 != null) {
                c4829Yo0.s(interfaceC4261Sr2);
            }
            return c4829Yo0;
        }

        @InterfaceC6181ey
        public b d(@InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2) {
            this.a = interfaceC4261Sr2;
            return this;
        }
    }

    /* renamed from: o.Yo0$c */
    /* loaded from: classes2.dex */
    public static class c extends LU {
        @Deprecated
        public c(Exception exc) {
            super(exc, 2000);
        }

        @Deprecated
        public c(String str, IOException iOException) {
            super(str, iOException, 2000);
        }

        public c(Throwable th, int i) {
            super(th, i);
        }

        public c(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 Throwable th, int i) {
            super(str, th, i);
        }
    }

    public C4829Yo0() {
        super(false);
    }

    public static RandomAccessFile C(Uri uri) throws c {
        int i = 2006;
        try {
            return new RandomAccessFile((String) C9542sf.g(uri.getPath()), "r");
        } catch (FileNotFoundException e) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (TD2.a < 21 || !a.b(e.getCause())) {
                    i = AD1.h1;
                }
                throw new c(e, i);
            }
            throw new c(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e, 1004);
        } catch (SecurityException e2) {
            throw new c(e2, 2006);
        } catch (RuntimeException e3) {
            throw new c(e3, 2000);
        }
    }

    @Override // o.FU
    public long a(OU ou) throws c {
        Uri uri = ou.a;
        this.g = uri;
        A(ou);
        RandomAccessFile C = C(uri);
        this.f = C;
        try {
            C.seek(ou.g);
            long j = ou.h;
            if (j == -1) {
                j = this.f.length() - ou.g;
            }
            this.h = j;
            if (j >= 0) {
                this.i = true;
                B(ou);
                return this.h;
            }
            throw new c(null, null, 2008);
        } catch (IOException e) {
            throw new c(e, 2000);
        }
    }

    @Override // o.FU
    public void close() throws c {
        this.g = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new c(e, 2000);
            }
        } finally {
            this.f = null;
            if (this.i) {
                this.i = false;
                z();
            }
        }
    }

    @Override // o.FU
    @InterfaceC11300zs1
    public Uri getUri() {
        return this.g;
    }

    @Override // o.CU
    public int read(byte[] bArr, int i, int i2) throws c {
        if (i2 == 0) {
            return 0;
        }
        if (this.h == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) TD2.o(this.f)).read(bArr, i, (int) Math.min(this.h, i2));
            if (read > 0) {
                this.h -= read;
                y(read);
            }
            return read;
        } catch (IOException e) {
            throw new c(e, 2000);
        }
    }
}
