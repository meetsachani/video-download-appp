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
import java.util.ArrayList;
import java.util.List;
import o.C9811tl1;
import o.InterfaceC5670cr1;
import o.InterfaceMenuC9553sh2;

/* loaded from: classes2.dex */
public class SafeParcelReader {

    /* loaded from: classes2.dex */
    public static class ParseException extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ParseException(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Parcel parcel) {
            super(str + " Parcel: pos=" + r0 + " size=" + r4);
            int dataPosition = parcel.dataPosition();
            int dataSize = parcel.dataSize();
        }
    }

    private SafeParcelReader() {
    }

    @InterfaceC5670cr1
    public static ArrayList<Parcel> A(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        ArrayList<Parcel> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                arrayList.add(obtain);
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                arrayList.add(null);
            }
        }
        parcel.setDataPosition(dataPosition + g0);
        return arrayList;
    }

    @InterfaceC5670cr1
    public static SparseArray<Parcel> B(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<Parcel> sparseArray = new SparseArray<>();
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            if (readInt3 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt3);
                sparseArray.append(readInt2, obtain);
                parcel.setDataPosition(dataPosition2 + readInt3);
            } else {
                sparseArray.append(readInt2, null);
            }
        }
        parcel.setDataPosition(dataPosition + g0);
        return sparseArray;
    }

    @InterfaceC5670cr1
    public static <T extends Parcelable> T C(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 Parcelable.Creator<T> creator) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + g0);
        return createFromParcel;
    }

    @InterfaceC5670cr1
    public static SparseBooleanArray D(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        SparseBooleanArray readSparseBooleanArray = parcel.readSparseBooleanArray();
        parcel.setDataPosition(dataPosition + g0);
        return readSparseBooleanArray;
    }

    @InterfaceC5670cr1
    public static SparseIntArray E(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseIntArray.append(parcel.readInt(), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + g0);
        return sparseIntArray;
    }

    @InterfaceC5670cr1
    public static SparseLongArray F(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        SparseLongArray sparseLongArray = new SparseLongArray();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseLongArray.append(parcel.readInt(), parcel.readLong());
        }
        parcel.setDataPosition(dataPosition + g0);
        return sparseLongArray;
    }

    @InterfaceC5670cr1
    public static String G(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + g0);
        return readString;
    }

    @InterfaceC5670cr1
    public static String[] H(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + g0);
        return createStringArray;
    }

    @InterfaceC5670cr1
    public static ArrayList<String> I(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + g0);
        return createStringArrayList;
    }

    @InterfaceC5670cr1
    public static SparseArray<String> J(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        SparseArray<String> sparseArray = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray.append(parcel.readInt(), parcel.readString());
        }
        parcel.setDataPosition(dataPosition + g0);
        return sparseArray;
    }

    @InterfaceC5670cr1
    public static <T> T[] K(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 Parcelable.Creator<T> creator) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + g0);
        return tArr;
    }

    @InterfaceC5670cr1
    public static <T> ArrayList<T> L(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 Parcelable.Creator<T> creator) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + g0);
        return createTypedArrayList;
    }

    @InterfaceC5670cr1
    public static <T> SparseArray<T> M(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 Parcelable.Creator<T> creator) {
        T t;
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<T> sparseArray = new SparseArray<>();
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                t = creator.createFromParcel(parcel);
            } else {
                t = null;
            }
            sparseArray.append(readInt2, t);
        }
        parcel.setDataPosition(dataPosition + g0);
        return sparseArray;
    }

    public static void N(@InterfaceC5670cr1 Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        throw new ParseException("Overread allowed size end=" + i, parcel);
    }

    public static int O(int i) {
        return (char) i;
    }

    public static boolean P(@InterfaceC5670cr1 Parcel parcel, int i) {
        k0(parcel, i, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    @InterfaceC5670cr1
    public static Boolean Q(@InterfaceC5670cr1 Parcel parcel, int i) {
        boolean z;
        int g0 = g0(parcel, i);
        if (g0 == 0) {
            return null;
        }
        j0(parcel, i, g0, 4);
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static byte R(@InterfaceC5670cr1 Parcel parcel, int i) {
        k0(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static char S(@InterfaceC5670cr1 Parcel parcel, int i) {
        k0(parcel, i, 4);
        return (char) parcel.readInt();
    }

    public static double T(@InterfaceC5670cr1 Parcel parcel, int i) {
        k0(parcel, i, 8);
        return parcel.readDouble();
    }

    @InterfaceC5670cr1
    public static Double U(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        if (g0 == 0) {
            return null;
        }
        j0(parcel, i, g0, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float V(@InterfaceC5670cr1 Parcel parcel, int i) {
        k0(parcel, i, 4);
        return parcel.readFloat();
    }

    @InterfaceC5670cr1
    public static Float W(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        if (g0 == 0) {
            return null;
        }
        j0(parcel, i, g0, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int X(@InterfaceC5670cr1 Parcel parcel) {
        return parcel.readInt();
    }

    @InterfaceC5670cr1
    public static IBinder Y(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + g0);
        return readStrongBinder;
    }

    public static int Z(@InterfaceC5670cr1 Parcel parcel, int i) {
        k0(parcel, i, 4);
        return parcel.readInt();
    }

    @InterfaceC5670cr1
    public static BigDecimal a(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + g0);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    @InterfaceC5670cr1
    public static Integer a0(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        if (g0 == 0) {
            return null;
        }
        j0(parcel, i, g0, 4);
        return Integer.valueOf(parcel.readInt());
    }

    @InterfaceC5670cr1
    public static BigDecimal[] b(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + g0);
        return bigDecimalArr;
    }

    public static void b0(@InterfaceC5670cr1 Parcel parcel, int i, @InterfaceC5670cr1 List list, @InterfaceC5670cr1 ClassLoader classLoader) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(dataPosition + g0);
    }

    @InterfaceC5670cr1
    public static BigInteger c(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + g0);
        return new BigInteger(createByteArray);
    }

    public static long c0(@InterfaceC5670cr1 Parcel parcel, int i) {
        k0(parcel, i, 8);
        return parcel.readLong();
    }

    @InterfaceC5670cr1
    public static BigInteger[] d(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + g0);
        return bigIntegerArr;
    }

    @InterfaceC5670cr1
    public static Long d0(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        if (g0 == 0) {
            return null;
        }
        j0(parcel, i, g0, 8);
        return Long.valueOf(parcel.readLong());
    }

    @InterfaceC5670cr1
    public static boolean[] e(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + g0);
        return createBooleanArray;
    }

    @InterfaceC5670cr1
    public static PendingIntent e0(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        PendingIntent readPendingIntentOrNullFromParcel = PendingIntent.readPendingIntentOrNullFromParcel(parcel);
        parcel.setDataPosition(dataPosition + g0);
        return readPendingIntentOrNullFromParcel;
    }

    @InterfaceC5670cr1
    public static ArrayList<Boolean> f(@InterfaceC5670cr1 Parcel parcel, int i) {
        boolean z;
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        ArrayList<Boolean> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(Boolean.valueOf(z));
        }
        parcel.setDataPosition(dataPosition + g0);
        return arrayList;
    }

    public static short f0(@InterfaceC5670cr1 Parcel parcel, int i) {
        k0(parcel, i, 4);
        return (short) parcel.readInt();
    }

    @InterfaceC5670cr1
    public static Bundle g(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + g0);
        return readBundle;
    }

    public static int g0(@InterfaceC5670cr1 Parcel parcel, int i) {
        if ((i & InterfaceMenuC9553sh2.c) != -65536) {
            return (char) (i >> 16);
        }
        return parcel.readInt();
    }

    @InterfaceC5670cr1
    public static byte[] h(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + g0);
        return createByteArray;
    }

    public static void h0(@InterfaceC5670cr1 Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + g0(parcel, i));
    }

    @InterfaceC5670cr1
    public static byte[][] i(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + g0);
        return bArr;
    }

    public static int i0(@InterfaceC5670cr1 Parcel parcel) {
        int X = X(parcel);
        int g0 = g0(parcel, X);
        int O = O(X);
        int dataPosition = parcel.dataPosition();
        if (O == 20293) {
            int i = g0 + dataPosition;
            if (i >= dataPosition && i <= parcel.dataSize()) {
                return i;
            }
            throw new ParseException("Size read is invalid start=" + dataPosition + " end=" + i, parcel);
        }
        throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(X))), parcel);
    }

    @InterfaceC5670cr1
    public static SparseArray<byte[]> j(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<byte[]> sparseArray = new SparseArray<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray.append(parcel.readInt(), parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + g0);
        return sparseArray;
    }

    public static void j0(Parcel parcel, int i, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        String hexString = Integer.toHexString(i2);
        throw new ParseException("Expected size " + i3 + " got " + i2 + " (0x" + hexString + C9811tl1.d, parcel);
    }

    @InterfaceC5670cr1
    public static char[] k(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        char[] createCharArray = parcel.createCharArray();
        parcel.setDataPosition(dataPosition + g0);
        return createCharArray;
    }

    public static void k0(Parcel parcel, int i, int i2) {
        int g0 = g0(parcel, i);
        if (g0 == i2) {
            return;
        }
        String hexString = Integer.toHexString(g0);
        throw new ParseException("Expected size " + i2 + " got " + g0 + " (0x" + hexString + C9811tl1.d, parcel);
    }

    @InterfaceC5670cr1
    public static double[] l(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + g0);
        return createDoubleArray;
    }

    @InterfaceC5670cr1
    public static ArrayList<Double> m(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        ArrayList<Double> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(dataPosition + g0);
        return arrayList;
    }

    @InterfaceC5670cr1
    public static SparseArray<Double> n(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        SparseArray<Double> sparseArray = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray.append(parcel.readInt(), Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(dataPosition + g0);
        return sparseArray;
    }

    @InterfaceC5670cr1
    public static float[] o(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + g0);
        return createFloatArray;
    }

    @InterfaceC5670cr1
    public static ArrayList<Float> p(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        ArrayList<Float> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(dataPosition + g0);
        return arrayList;
    }

    @InterfaceC5670cr1
    public static SparseArray<Float> q(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        SparseArray<Float> sparseArray = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray.append(parcel.readInt(), Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(dataPosition + g0);
        return sparseArray;
    }

    @InterfaceC5670cr1
    public static IBinder[] r(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        IBinder[] createBinderArray = parcel.createBinderArray();
        parcel.setDataPosition(dataPosition + g0);
        return createBinderArray;
    }

    @InterfaceC5670cr1
    public static ArrayList<IBinder> s(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        ArrayList<IBinder> createBinderArrayList = parcel.createBinderArrayList();
        parcel.setDataPosition(dataPosition + g0);
        return createBinderArrayList;
    }

    @InterfaceC5670cr1
    public static SparseArray<IBinder> t(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<IBinder> sparseArray = new SparseArray<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray.append(parcel.readInt(), parcel.readStrongBinder());
        }
        parcel.setDataPosition(dataPosition + g0);
        return sparseArray;
    }

    @InterfaceC5670cr1
    public static int[] u(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + g0);
        return createIntArray;
    }

    @InterfaceC5670cr1
    public static ArrayList<Integer> v(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + g0);
        return arrayList;
    }

    @InterfaceC5670cr1
    public static long[] w(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + g0);
        return createLongArray;
    }

    @InterfaceC5670cr1
    public static ArrayList<Long> x(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        ArrayList<Long> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(dataPosition + g0);
        return arrayList;
    }

    @InterfaceC5670cr1
    public static Parcel y(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, g0);
        parcel.setDataPosition(dataPosition + g0);
        return obtain;
    }

    @InterfaceC5670cr1
    public static Parcel[] z(@InterfaceC5670cr1 Parcel parcel, int i) {
        int g0 = g0(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g0 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + g0);
        return parcelArr;
    }
}
