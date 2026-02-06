package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import o.TD0;

/* loaded from: classes.dex */
public class ZE2 extends YE2 {
    public static final boolean B = false;
    public static final String C = "VersionedParcelParcel";
    public int A;
    public final SparseIntArray t;
    public final Parcel u;
    public final int v;
    public final int w;
    public final String x;
    public int y;
    public int z;

    public ZE2(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C2531Be(), new C2531Be(), new C2531Be());
    }

    @Override // o.YE2
    public void C0(double d) {
        this.u.writeDouble(d);
    }

    @Override // o.YE2
    public boolean F(int i) {
        while (this.z < this.w) {
            int i2 = this.A;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.u.setDataPosition(this.z);
            int readInt = this.u.readInt();
            this.A = this.u.readInt();
            this.z += readInt;
        }
        if (this.A != i) {
            return false;
        }
        return true;
    }

    @Override // o.YE2
    public float G() {
        return this.u.readFloat();
    }

    @Override // o.YE2
    public void H0(float f) {
        this.u.writeFloat(f);
    }

    @Override // o.YE2
    public int L() {
        return this.u.readInt();
    }

    @Override // o.YE2
    public void L0(int i) {
        this.u.writeInt(i);
    }

    @Override // o.YE2
    public long Q() {
        return this.u.readLong();
    }

    @Override // o.YE2
    public void Q0(long j) {
        this.u.writeLong(j);
    }

    @Override // o.YE2
    public <T extends Parcelable> T V() {
        return (T) this.u.readParcelable(getClass().getClassLoader());
    }

    @Override // o.YE2
    public void W0(Parcelable parcelable) {
        this.u.writeParcelable(parcelable, 0);
    }

    @Override // o.YE2
    public void a() {
        int i = this.y;
        if (i >= 0) {
            int i2 = this.t.get(i);
            int dataPosition = this.u.dataPosition();
            this.u.setDataPosition(i2);
            this.u.writeInt(dataPosition - i2);
            this.u.setDataPosition(dataPosition);
        }
    }

    @Override // o.YE2
    public YE2 c() {
        Parcel parcel = this.u;
        int dataPosition = parcel.dataPosition();
        int i = this.z;
        if (i == this.v) {
            i = this.w;
        }
        return new ZE2(parcel, dataPosition, i, this.x + TD0.a.Y0, this.a, this.b, this.c);
    }

    @Override // o.YE2
    public String c0() {
        return this.u.readString();
    }

    @Override // o.YE2
    public IBinder e0() {
        return this.u.readStrongBinder();
    }

    @Override // o.YE2
    public void e1(String str) {
        this.u.writeString(str);
    }

    @Override // o.YE2
    public void g1(IBinder iBinder) {
        this.u.writeStrongBinder(iBinder);
    }

    @Override // o.YE2
    public void i0(int i) {
        a();
        this.y = i;
        this.t.put(i, this.u.dataPosition());
        L0(0);
        L0(i);
    }

    @Override // o.YE2
    public void i1(IInterface iInterface) {
        this.u.writeStrongInterface(iInterface);
    }

    @Override // o.YE2
    public boolean l() {
        if (this.u.readInt() != 0) {
            return true;
        }
        return false;
    }

    @Override // o.YE2
    public void m0(boolean z) {
        this.u.writeInt(z ? 1 : 0);
    }

    @Override // o.YE2
    public Bundle p() {
        return this.u.readBundle(getClass().getClassLoader());
    }

    @Override // o.YE2
    public void q0(Bundle bundle) {
        this.u.writeBundle(bundle);
    }

    @Override // o.YE2
    public byte[] s() {
        int readInt = this.u.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.u.readByteArray(bArr);
        return bArr;
    }

    @Override // o.YE2
    public void t0(byte[] bArr) {
        if (bArr != null) {
            this.u.writeInt(bArr.length);
            this.u.writeByteArray(bArr);
            return;
        }
        this.u.writeInt(-1);
    }

    @Override // o.YE2
    public CharSequence v() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.u);
    }

    @Override // o.YE2
    public void v0(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            this.u.writeInt(bArr.length);
            this.u.writeByteArray(bArr, i, i2);
            return;
        }
        this.u.writeInt(-1);
    }

    @Override // o.YE2
    public double y() {
        return this.u.readDouble();
    }

    @Override // o.YE2
    public void y0(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.u, 0);
    }

    public ZE2(Parcel parcel, int i, int i2, String str, C2531Be<String, Method> c2531Be, C2531Be<String, Method> c2531Be2, C2531Be<String, Class> c2531Be3) {
        super(c2531Be, c2531Be2, c2531Be3);
        this.t = new SparseIntArray();
        this.y = -1;
        this.A = -1;
        this.u = parcel;
        this.v = i;
        this.w = i2;
        this.z = i;
        this.x = str;
    }
}
