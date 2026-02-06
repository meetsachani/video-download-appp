package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Set;
import o.YE2;

/* renamed from: o.aF2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5040aF2 extends YE2 {
    public static final Charset C = Charset.forName(OA.c);
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 4;
    public static final int I = 5;
    public static final int J = 6;
    public static final int K = 7;
    public static final int L = 8;
    public static final int M = 9;
    public static final int N = 10;
    public static final int O = 11;
    public static final int P = 12;
    public static final int Q = 13;
    public static final int R = 14;
    public int A;
    public int B;
    public final DataInputStream t;
    public final DataOutputStream u;
    public DataInputStream v;
    public DataOutputStream w;
    public b x;
    public boolean y;
    public int z;

    /* renamed from: o.aF2$b */
    /* loaded from: classes.dex */
    public static class b {
        public final ByteArrayOutputStream a;
        public final DataOutputStream b;
        public final int c;
        public final DataOutputStream d;

        public b(int i, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.a = byteArrayOutputStream;
            this.b = new DataOutputStream(byteArrayOutputStream);
            this.c = i;
            this.d = dataOutputStream;
        }

        public void a() throws IOException {
            int i;
            this.b.flush();
            int size = this.a.size();
            int i2 = this.c << 16;
            if (size >= 65535) {
                i = 65535;
            } else {
                i = size;
            }
            this.d.writeInt(i2 | i);
            if (size >= 65535) {
                this.d.writeInt(size);
            }
            this.a.writeTo(this.d);
        }
    }

    public C5040aF2(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, new C2531Be(), new C2531Be(), new C2531Be());
    }

    @Override // o.YE2
    public void C0(double d) {
        try {
            this.w.writeDouble(d);
        } catch (IOException e) {
            throw new YE2.b(e);
        }
    }

    @Override // o.YE2
    public boolean F(int i) {
        while (true) {
            try {
                int i2 = this.A;
                if (i2 == i) {
                    return true;
                }
                if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                    return false;
                }
                int i3 = this.z;
                int i4 = this.B;
                if (i3 < i4) {
                    this.t.skip(i4 - i3);
                }
                this.B = -1;
                int readInt = this.t.readInt();
                this.z = 0;
                int i5 = readInt & 65535;
                if (i5 == 65535) {
                    i5 = this.t.readInt();
                }
                this.A = (readInt >> 16) & 65535;
                this.B = i5;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // o.YE2
    public float G() {
        try {
            return this.v.readFloat();
        } catch (IOException e) {
            throw new YE2.b(e);
        }
    }

    @Override // o.YE2
    public void H0(float f) {
        try {
            this.w.writeFloat(f);
        } catch (IOException e) {
            throw new YE2.b(e);
        }
    }

    @Override // o.YE2
    public int L() {
        try {
            return this.v.readInt();
        } catch (IOException e) {
            throw new YE2.b(e);
        }
    }

    @Override // o.YE2
    public void L0(int i) {
        try {
            this.w.writeInt(i);
        } catch (IOException e) {
            throw new YE2.b(e);
        }
    }

    @Override // o.YE2
    public long Q() {
        try {
            return this.v.readLong();
        } catch (IOException e) {
            throw new YE2.b(e);
        }
    }

    @Override // o.YE2
    public void Q0(long j) {
        try {
            this.w.writeLong(j);
        } catch (IOException e) {
            throw new YE2.b(e);
        }
    }

    @Override // o.YE2
    public <T extends Parcelable> T V() {
        return null;
    }

    @Override // o.YE2
    public void W0(Parcelable parcelable) {
        if (this.y) {
            return;
        }
        throw new RuntimeException("Parcelables cannot be written to an OutputStream");
    }

    @Override // o.YE2
    public void a() {
        b bVar = this.x;
        if (bVar != null) {
            try {
                if (bVar.a.size() != 0) {
                    this.x.a();
                }
                this.x = null;
            } catch (IOException e) {
                throw new YE2.b(e);
            }
        }
    }

    @Override // o.YE2
    public YE2 c() {
        return new C5040aF2(this.v, this.w, this.a, this.b, this.c);
    }

    @Override // o.YE2
    public String c0() {
        try {
            int readInt = this.v.readInt();
            if (readInt > 0) {
                byte[] bArr = new byte[readInt];
                this.v.readFully(bArr);
                return new String(bArr, C);
            }
            return null;
        } catch (IOException e) {
            throw new YE2.b(e);
        }
    }

    @Override // o.YE2
    public IBinder e0() {
        return null;
    }

    @Override // o.YE2
    public void e1(String str) {
        try {
            if (str != null) {
                byte[] bytes = str.getBytes(C);
                this.w.writeInt(bytes.length);
                this.w.write(bytes);
                return;
            }
            this.w.writeInt(-1);
        } catch (IOException e) {
            throw new YE2.b(e);
        }
    }

    @Override // o.YE2
    public void g1(IBinder iBinder) {
        if (this.y) {
            return;
        }
        throw new RuntimeException("Binders cannot be written to an OutputStream");
    }

    @Override // o.YE2
    public boolean i() {
        return true;
    }

    @Override // o.YE2
    public void i0(int i) {
        a();
        b bVar = new b(i, this.u);
        this.x = bVar;
        this.w = bVar.b;
    }

    @Override // o.YE2
    public void i1(IInterface iInterface) {
        if (this.y) {
            return;
        }
        throw new RuntimeException("Binders cannot be written to an OutputStream");
    }

    @Override // o.YE2
    public void j0(boolean z, boolean z2) {
        if (z) {
            this.y = z2;
            return;
        }
        throw new RuntimeException("Serialization of this object is not allowed");
    }

    @Override // o.YE2
    public boolean l() {
        try {
            return this.v.readBoolean();
        } catch (IOException e) {
            throw new YE2.b(e);
        }
    }

    @Override // o.YE2
    public void m0(boolean z) {
        try {
            this.w.writeBoolean(z);
        } catch (IOException e) {
            throw new YE2.b(e);
        }
    }

    public final void o1(int i, String str, Bundle bundle) {
        switch (i) {
            case 0:
                bundle.putParcelable(str, null);
                return;
            case 1:
                bundle.putBundle(str, p());
                return;
            case 2:
                bundle.putBundle(str, p());
                return;
            case 3:
                bundle.putString(str, c0());
                return;
            case 4:
                bundle.putStringArray(str, (String[]) j(new String[0]));
                return;
            case 5:
                bundle.putBoolean(str, l());
                return;
            case 6:
                bundle.putBooleanArray(str, n());
                return;
            case 7:
                bundle.putDouble(str, y());
                return;
            case 8:
                bundle.putDoubleArray(str, A());
                return;
            case 9:
                bundle.putInt(str, L());
                return;
            case 10:
                bundle.putIntArray(str, N());
                return;
            case 11:
                bundle.putLong(str, Q());
                return;
            case 12:
                bundle.putLongArray(str, S());
                return;
            case 13:
                bundle.putFloat(str, G());
                return;
            case 14:
                bundle.putFloatArray(str, I());
                return;
            default:
                throw new RuntimeException("Unknown type " + i);
        }
    }

    @Override // o.YE2
    public Bundle p() {
        int L2 = L();
        if (L2 < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i = 0; i < L2; i++) {
            o1(L(), c0(), bundle);
        }
        return bundle;
    }

    public final void p1(Object obj) {
        if (obj == null) {
            L0(0);
        } else if (obj instanceof Bundle) {
            L0(1);
            q0((Bundle) obj);
        } else if (obj instanceof String) {
            L0(3);
            e1((String) obj);
        } else if (obj instanceof String[]) {
            L0(4);
            k0((String[]) obj);
        } else if (obj instanceof Boolean) {
            L0(5);
            m0(((Boolean) obj).booleanValue());
        } else if (obj instanceof boolean[]) {
            L0(6);
            o0((boolean[]) obj);
        } else if (obj instanceof Double) {
            L0(7);
            C0(((Double) obj).doubleValue());
        } else if (obj instanceof double[]) {
            L0(8);
            E0((double[]) obj);
        } else if (obj instanceof Integer) {
            L0(9);
            L0(((Integer) obj).intValue());
        } else if (obj instanceof int[]) {
            L0(10);
            N0((int[]) obj);
        } else if (obj instanceof Long) {
            L0(11);
            Q0(((Long) obj).longValue());
        } else if (obj instanceof long[]) {
            L0(12);
            S0((long[]) obj);
        } else if (obj instanceof Float) {
            L0(13);
            H0(((Float) obj).floatValue());
        } else if (obj instanceof float[]) {
            L0(14);
            J0((float[]) obj);
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    @Override // o.YE2
    public void q0(Bundle bundle) {
        try {
            if (bundle != null) {
                Set<String> keySet = bundle.keySet();
                this.w.writeInt(keySet.size());
                for (String str : keySet) {
                    e1(str);
                    p1(bundle.get(str));
                }
                return;
            }
            this.w.writeInt(-1);
        } catch (IOException e) {
            throw new YE2.b(e);
        }
    }

    @Override // o.YE2
    public byte[] s() {
        try {
            int readInt = this.v.readInt();
            if (readInt > 0) {
                byte[] bArr = new byte[readInt];
                this.v.readFully(bArr);
                return bArr;
            }
            return null;
        } catch (IOException e) {
            throw new YE2.b(e);
        }
    }

    @Override // o.YE2
    public void t0(byte[] bArr) {
        try {
            if (bArr != null) {
                this.w.writeInt(bArr.length);
                this.w.write(bArr);
                return;
            }
            this.w.writeInt(-1);
        } catch (IOException e) {
            throw new YE2.b(e);
        }
    }

    @Override // o.YE2
    public CharSequence v() {
        return null;
    }

    @Override // o.YE2
    public void v0(byte[] bArr, int i, int i2) {
        try {
            if (bArr != null) {
                this.w.writeInt(i2);
                this.w.write(bArr, i, i2);
                return;
            }
            this.w.writeInt(-1);
        } catch (IOException e) {
            throw new YE2.b(e);
        }
    }

    @Override // o.YE2
    public double y() {
        try {
            return this.v.readDouble();
        } catch (IOException e) {
            throw new YE2.b(e);
        }
    }

    @Override // o.YE2
    public void y0(CharSequence charSequence) {
        if (this.y) {
            return;
        }
        throw new RuntimeException("CharSequence cannot be written to an OutputStream");
    }

    public C5040aF2(InputStream inputStream, OutputStream outputStream, C2531Be<String, Method> c2531Be, C2531Be<String, Method> c2531Be2, C2531Be<String, Class> c2531Be3) {
        super(c2531Be, c2531Be2, c2531Be3);
        this.z = 0;
        this.A = -1;
        this.B = -1;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new a(inputStream)) : null;
        this.t = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.u = dataOutputStream;
        this.v = dataInputStream;
        this.w = dataOutputStream;
    }

    /* renamed from: o.aF2$a */
    /* loaded from: classes.dex */
    public class a extends FilterInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            C5040aF2 c5040aF2 = C5040aF2.this;
            int i = c5040aF2.B;
            if (i != -1 && c5040aF2.z >= i) {
                throw new IOException();
            }
            int read = super.read();
            C5040aF2.this.z++;
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) throws IOException {
            C5040aF2 c5040aF2 = C5040aF2.this;
            int i = c5040aF2.B;
            if (i != -1 && c5040aF2.z >= i) {
                throw new IOException();
            }
            long skip = super.skip(j);
            if (skip > 0) {
                C5040aF2.this.z += (int) skip;
            }
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            C5040aF2 c5040aF2 = C5040aF2.this;
            int i3 = c5040aF2.B;
            if (i3 != -1 && c5040aF2.z >= i3) {
                throw new IOException();
            }
            int read = super.read(bArr, i, i2);
            if (read > 0) {
                C5040aF2.this.z += read;
            }
            return read;
        }
    }
}
