package com.google.android.gms.common.internal.safeparcel;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import o.InterfaceC5670cr1;
import o.InterfaceMenuC9553sh2;

/* loaded from: classes2.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static void A(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 SparseArray<Float> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeFloat(sparseArray.valueAt(i2).floatValue());
        }
        g0(parcel, f0);
    }

    public static void B(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        parcel.writeStrongBinder(iBinder);
        g0(parcel, f0);
    }

    public static void C(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 IBinder[] iBinderArr, boolean z) {
        if (iBinderArr == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        parcel.writeBinderArray(iBinderArr);
        g0(parcel, f0);
    }

    public static void D(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 List<IBinder> list, boolean z) {
        if (list == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        parcel.writeBinderList(list);
        g0(parcel, f0);
    }

    public static void E(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 SparseArray<IBinder> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeStrongBinder(sparseArray.valueAt(i2));
        }
        g0(parcel, f0);
    }

    public static void F(@InterfaceC5670cr1 Parcel parcel, int i, int i2) {
        h0(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void G(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        parcel.writeIntArray(iArr);
        g0(parcel, f0);
    }

    public static void H(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 List<Integer> list, boolean z) {
        if (list == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(list.get(i2).intValue());
        }
        g0(parcel, f0);
    }

    public static void I(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 Integer num, boolean z) {
        if (num == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        h0(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void J(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 List list, boolean z) {
        if (list == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        parcel.writeList(list);
        g0(parcel, f0);
    }

    public static void K(@InterfaceC5670cr1 Parcel parcel, int i, long j) {
        h0(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void L(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 long[] jArr, boolean z) {
        if (jArr == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        parcel.writeLongArray(jArr);
        g0(parcel, f0);
    }

    public static void M(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 List<Long> list, boolean z) {
        if (list == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeLong(list.get(i2).longValue());
        }
        g0(parcel, f0);
    }

    public static void N(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 Long l, boolean z) {
        if (l == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        h0(parcel, i, 8);
        parcel.writeLong(l.longValue());
    }

    public static void O(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 Parcel parcel2, boolean z) {
        if (parcel2 == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        parcel.appendFrom(parcel2, 0, parcel2.dataSize());
        g0(parcel, f0);
    }

    public static void P(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 Parcel[] parcelArr, boolean z) {
        if (parcelArr == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        parcel.writeInt(parcelArr.length);
        for (Parcel parcel2 : parcelArr) {
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        g0(parcel, f0);
    }

    public static void Q(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 List<Parcel> list, boolean z) {
        if (list == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcel parcel2 = list.get(i2);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        g0(parcel, f0);
    }

    public static void R(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 SparseArray<Parcel> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            Parcel valueAt = sparseArray.valueAt(i2);
            if (valueAt != null) {
                parcel.writeInt(valueAt.dataSize());
                parcel.appendFrom(valueAt, 0, valueAt.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        g0(parcel, f0);
    }

    public static void S(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        g0(parcel, f0);
    }

    public static void T(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        PendingIntent.writePendingIntentOrNullToParcel(pendingIntent, parcel);
        g0(parcel, f0);
    }

    public static void U(@InterfaceC5670cr1 Parcel parcel, int i, short s) {
        h0(parcel, i, 4);
        parcel.writeInt(s);
    }

    public static void V(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 SparseBooleanArray sparseBooleanArray, boolean z) {
        if (sparseBooleanArray == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        parcel.writeSparseBooleanArray(sparseBooleanArray);
        g0(parcel, f0);
    }

    public static void W(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 SparseIntArray sparseIntArray, boolean z) {
        if (sparseIntArray == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseIntArray.keyAt(i2));
            parcel.writeInt(sparseIntArray.valueAt(i2));
        }
        g0(parcel, f0);
    }

    public static void X(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 SparseLongArray sparseLongArray, boolean z) {
        if (sparseLongArray == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseLongArray.keyAt(i2));
            parcel.writeLong(sparseLongArray.valueAt(i2));
        }
        g0(parcel, f0);
    }

    public static void Y(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 String str, boolean z) {
        if (str == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        parcel.writeString(str);
        g0(parcel, f0);
    }

    public static void Z(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        parcel.writeStringArray(strArr);
        g0(parcel, f0);
    }

    public static int a(@InterfaceC5670cr1 Parcel parcel) {
        return f0(parcel, 20293);
    }

    public static void a0(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        parcel.writeStringList(list);
        g0(parcel, f0);
    }

    public static void b(@InterfaceC5670cr1 Parcel parcel, int i) {
        g0(parcel, i);
    }

    public static void b0(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 SparseArray<String> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeString(sparseArray.valueAt(i2));
        }
        g0(parcel, f0);
    }

    public static void c(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 BigDecimal bigDecimal, boolean z) {
        if (bigDecimal == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
        parcel.writeInt(bigDecimal.scale());
        g0(parcel, f0);
    }

    public static <T extends Parcelable> void c0(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 T[] tArr, int i2, boolean z) {
        if (tArr == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                i0(parcel, t, i2);
            }
        }
        g0(parcel, f0);
    }

    public static void d(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 BigDecimal[] bigDecimalArr, boolean z) {
        if (bigDecimalArr == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i2 = 0; i2 < length; i2++) {
            parcel.writeByteArray(bigDecimalArr[i2].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i2].scale());
        }
        g0(parcel, f0);
    }

    public static <T extends Parcelable> void d0(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                i0(parcel, t, 0);
            }
        }
        g0(parcel, f0);
    }

    public static void e(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 BigInteger bigInteger, boolean z) {
        if (bigInteger == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        parcel.writeByteArray(bigInteger.toByteArray());
        g0(parcel, f0);
    }

    public static <T extends Parcelable> void e0(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 SparseArray<T> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            T valueAt = sparseArray.valueAt(i2);
            if (valueAt == null) {
                parcel.writeInt(0);
            } else {
                i0(parcel, valueAt, 0);
            }
        }
        g0(parcel, f0);
    }

    public static void f(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 BigInteger[] bigIntegerArr, boolean z) {
        if (bigIntegerArr == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        g0(parcel, f0);
    }

    public static int f0(Parcel parcel, int i) {
        parcel.writeInt(i | InterfaceMenuC9553sh2.c);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void g(@InterfaceC5670cr1 Parcel parcel, int i, boolean z) {
        h0(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void g0(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static void h(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 boolean[] zArr, boolean z) {
        if (zArr == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        parcel.writeBooleanArray(zArr);
        g0(parcel, f0);
    }

    public static void h0(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static void i(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 List<Boolean> list, boolean z) {
        if (list == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(list.get(i2).booleanValue() ? 1 : 0);
        }
        g0(parcel, f0);
    }

    public static void i0(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static void j(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 Boolean bool, boolean z) {
        if (bool == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        h0(parcel, i, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void k(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        parcel.writeBundle(bundle);
        g0(parcel, f0);
    }

    public static void l(@InterfaceC5670cr1 Parcel parcel, int i, byte b) {
        h0(parcel, i, 4);
        parcel.writeInt(b);
    }

    public static void m(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        parcel.writeByteArray(bArr);
        g0(parcel, f0);
    }

    public static void n(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 byte[][] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        g0(parcel, f0);
    }

    public static void o(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 SparseArray<byte[]> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeByteArray(sparseArray.valueAt(i2));
        }
        g0(parcel, f0);
    }

    public static void p(@InterfaceC5670cr1 Parcel parcel, int i, char c) {
        h0(parcel, i, 4);
        parcel.writeInt(c);
    }

    public static void q(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 char[] cArr, boolean z) {
        if (cArr == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        parcel.writeCharArray(cArr);
        g0(parcel, f0);
    }

    public static void r(@InterfaceC5670cr1 Parcel parcel, int i, double d) {
        h0(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void s(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 double[] dArr, boolean z) {
        if (dArr == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        parcel.writeDoubleArray(dArr);
        g0(parcel, f0);
    }

    public static void t(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 List<Double> list, boolean z) {
        if (list == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeDouble(list.get(i2).doubleValue());
        }
        g0(parcel, f0);
    }

    public static void u(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 Double d, boolean z) {
        if (d == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        h0(parcel, i, 8);
        parcel.writeDouble(d.doubleValue());
    }

    public static void v(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 SparseArray<Double> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeDouble(sparseArray.valueAt(i2).doubleValue());
        }
        g0(parcel, f0);
    }

    public static void w(@InterfaceC5670cr1 Parcel parcel, int i, float f) {
        h0(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void x(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 float[] fArr, boolean z) {
        if (fArr == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        parcel.writeFloatArray(fArr);
        g0(parcel, f0);
    }

    public static void y(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 List<Float> list, boolean z) {
        if (list == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        int f0 = f0(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeFloat(list.get(i2).floatValue());
        }
        g0(parcel, f0);
    }

    public static void z(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 Float f, boolean z) {
        if (f == null) {
            if (z) {
                h0(parcel, i, 0);
                return;
            }
            return;
        }
        h0(parcel, i, 4);
        parcel.writeFloat(f.floatValue());
    }
}
