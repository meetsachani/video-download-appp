package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.sqlite.CursorWrapper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o.C9811tl1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
@KeepName
@SafeParcelable.Class(creator = "DataHolderCreator", validate = true)
/* loaded from: classes2.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    @InterfaceC5670cr1
    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zaf();
    public static final Builder f1 = new zab(new String[0], null);
    @SafeParcelable.VersionField(id = 1000)
    public final int X;
    @SafeParcelable.Field(getter = "getColumns", id = 1)
    public final String[] Y;
    @SafeParcelable.Field(getter = "getWindows", id = 2)
    public final CursorWindow[] Y0;
    public Bundle Z;
    @SafeParcelable.Field(getter = "getStatusCode", id = 3)
    public final int Z0;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getMetadata", id = 4)
    public final Bundle a1;
    public int[] b1;
    public int c1;
    public boolean d1;
    public boolean e1;

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class Builder {
        public final String[] a;
        public final ArrayList<HashMap<String, Object>> b = new ArrayList<>();
        public final HashMap<Object, Integer> c = new HashMap<>();

        public /* synthetic */ Builder(String[] strArr, String str, zac zacVar) {
            this.a = (String[]) Preconditions.r(strArr);
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public DataHolder a(int i) {
            return new DataHolder(this, i);
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public DataHolder b(int i, @InterfaceC5670cr1 Bundle bundle) {
            return new DataHolder(this, i, bundle);
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public Builder c(@InterfaceC5670cr1 ContentValues contentValues) {
            Asserts.c(contentValues);
            HashMap<String, Object> hashMap = new HashMap<>(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return d(hashMap);
        }

        @InterfaceC5670cr1
        public Builder d(@InterfaceC5670cr1 HashMap<String, Object> hashMap) {
            Asserts.c(hashMap);
            this.b.add(hashMap);
            return this;
        }
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static DataHolder B0(int i) {
        return new DataHolder(f1, i, (Bundle) null);
    }

    public static CursorWindow[] c2(Builder builder, int i) {
        long j;
        if (builder.a.length != 0) {
            ArrayList arrayList = builder.b;
            int size = arrayList.size();
            CursorWindow cursorWindow = new CursorWindow(false);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(cursorWindow);
            cursorWindow.setNumColumns(builder.a.length);
            int i2 = 0;
            boolean z = false;
            while (i2 < size) {
                try {
                    if (!cursorWindow.allocRow()) {
                        StringBuilder sb = new StringBuilder(72);
                        sb.append("Allocating additional cursor window for large data set (row ");
                        sb.append(i2);
                        sb.append(C9811tl1.d);
                        Log.d("DataHolder", sb.toString());
                        cursorWindow = new CursorWindow(false);
                        cursorWindow.setStartPosition(i2);
                        cursorWindow.setNumColumns(builder.a.length);
                        arrayList2.add(cursorWindow);
                        if (!cursorWindow.allocRow()) {
                            Log.e("DataHolder", "Unable to allocate row to hold data.");
                            arrayList2.remove(cursorWindow);
                            return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                        }
                    }
                    Map map = (Map) arrayList.get(i2);
                    int i3 = 0;
                    boolean z2 = true;
                    while (true) {
                        if (i3 < builder.a.length) {
                            if (!z2) {
                                break;
                            }
                            String str = builder.a[i3];
                            Object obj = map.get(str);
                            if (obj == null) {
                                z2 = cursorWindow.putNull(i2, i3);
                            } else if (obj instanceof String) {
                                z2 = cursorWindow.putString((String) obj, i2, i3);
                            } else if (obj instanceof Long) {
                                z2 = cursorWindow.putLong(((Long) obj).longValue(), i2, i3);
                            } else if (obj instanceof Integer) {
                                z2 = cursorWindow.putLong(((Integer) obj).intValue(), i2, i3);
                            } else if (obj instanceof Boolean) {
                                if (true != ((Boolean) obj).booleanValue()) {
                                    j = 0;
                                } else {
                                    j = 1;
                                }
                                z2 = cursorWindow.putLong(j, i2, i3);
                            } else if (obj instanceof byte[]) {
                                z2 = cursorWindow.putBlob((byte[]) obj, i2, i3);
                            } else if (obj instanceof Double) {
                                z2 = cursorWindow.putDouble(((Double) obj).doubleValue(), i2, i3);
                            } else if (obj instanceof Float) {
                                z2 = cursorWindow.putDouble(((Float) obj).floatValue(), i2, i3);
                            } else {
                                String obj2 = obj.toString();
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + obj2.length());
                                sb2.append("Unsupported object for column ");
                                sb2.append(str);
                                sb2.append(": ");
                                sb2.append(obj2);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            i3++;
                        } else if (z2) {
                            z = false;
                        }
                    }
                    if (!z) {
                        StringBuilder sb3 = new StringBuilder(74);
                        sb3.append("Couldn't populate window data for row ");
                        sb3.append(i2);
                        sb3.append(" - allocating new window.");
                        Log.d("DataHolder", sb3.toString());
                        cursorWindow.freeLastRow();
                        cursorWindow = new CursorWindow(false);
                        cursorWindow.setStartPosition(i2);
                        cursorWindow.setNumColumns(builder.a.length);
                        arrayList2.add(cursorWindow);
                        i2--;
                        z = true;
                        i2++;
                    } else {
                        throw new zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                    }
                } catch (RuntimeException e) {
                    int size2 = arrayList2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        ((CursorWindow) arrayList2.get(i4)).close();
                    }
                    throw e;
                }
            }
            return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
        }
        return new CursorWindow[0];
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static Builder m0(@InterfaceC5670cr1 String[] strArr) {
        return new Builder(strArr, null, null);
    }

    @KeepForSdk
    public boolean E0(@InterfaceC5670cr1 String str, int i, int i2) {
        T1(str, i);
        if (this.Y0[i2].getLong(i, this.Z.getInt(str)) == 1) {
            return true;
        }
        return false;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public byte[] G0(@InterfaceC5670cr1 String str, int i, int i2) {
        T1(str, i);
        return this.Y0[i2].getBlob(i, this.Z.getInt(str));
    }

    @KeepForSdk
    public int H0(@InterfaceC5670cr1 String str, int i, int i2) {
        T1(str, i);
        return this.Y0[i2].getInt(i, this.Z.getInt(str));
    }

    @KeepForSdk
    public long I0(@InterfaceC5670cr1 String str, int i, int i2) {
        T1(str, i);
        return this.Y0[i2].getLong(i, this.Z.getInt(str));
    }

    public final void I1(@InterfaceC5670cr1 String str, int i, int i2, @InterfaceC5670cr1 CharArrayBuffer charArrayBuffer) {
        T1(str, i);
        this.Y0[i2].copyStringToBuffer(i, this.Z.getInt(str), charArrayBuffer);
    }

    public final void M1() {
        this.Z = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.Y;
            if (i2 >= strArr.length) {
                break;
            }
            this.Z.putInt(strArr[i2], i2);
            i2++;
        }
        this.b1 = new int[this.Y0.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.Y0;
            if (i < cursorWindowArr.length) {
                this.b1[i] = i3;
                i3 += this.Y0[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                this.c1 = i3;
                return;
            }
        }
    }

    @KeepForSdk
    public int O0() {
        return this.Z0;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public String S0(@InterfaceC5670cr1 String str, int i, int i2) {
        T1(str, i);
        return this.Y0[i2].getString(i, this.Z.getInt(str));
    }

    public final void T1(String str, int i) {
        String str2;
        Bundle bundle = this.Z;
        if (bundle != null && bundle.containsKey(str)) {
            if (!isClosed()) {
                if (i >= 0 && i < this.c1) {
                    return;
                }
                throw new CursorIndexOutOfBoundsException(i, this.c1);
            }
            throw new IllegalArgumentException("Buffer is closed.");
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "No such column: ".concat(valueOf);
        } else {
            str2 = new String("No such column: ");
        }
        throw new IllegalArgumentException(str2);
    }

    @KeepForSdk
    public int U0(int i) {
        boolean z;
        int length;
        int i2 = 0;
        if (i >= 0 && i < this.c1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.x(z);
        while (true) {
            int[] iArr = this.b1;
            length = iArr.length;
            if (i2 >= length) {
                break;
            } else if (i < iArr[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        if (i2 == length) {
            return i2 - 1;
        }
        return i2;
    }

    @KeepForSdk
    public boolean V0(@InterfaceC5670cr1 String str) {
        return this.Z.containsKey(str);
    }

    @KeepForSdk
    public boolean Z0(@InterfaceC5670cr1 String str, int i, int i2) {
        T1(str, i);
        return this.Y0[i2].isNull(i, this.Z.getInt(str));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    public void close() {
        synchronized (this) {
            try {
                if (!this.d1) {
                    this.d1 = true;
                    int i = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.Y0;
                        if (i >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i].close();
                        i++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final double e1(@InterfaceC5670cr1 String str, int i, int i2) {
        T1(str, i);
        return this.Y0[i2].getDouble(i, this.Z.getInt(str));
    }

    public final void finalize() throws Throwable {
        try {
            if (this.e1 && this.Y0.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(C9811tl1.d);
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public int getCount() {
        return this.c1;
    }

    @KeepForSdk
    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.d1;
        }
        return z;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public Bundle o0() {
        return this.a1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.Z(parcel, 1, this.Y, false);
        SafeParcelWriter.c0(parcel, 2, this.Y0, i, false);
        SafeParcelWriter.F(parcel, 3, O0());
        SafeParcelWriter.k(parcel, 4, o0(), false);
        SafeParcelWriter.F(parcel, 1000, this.X);
        SafeParcelWriter.b(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }

    public final float x1(@InterfaceC5670cr1 String str, int i, int i2) {
        T1(str, i);
        return this.Y0[i2].getFloat(i, this.Z.getInt(str));
    }

    @SafeParcelable.Constructor
    public DataHolder(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) String[] strArr, @SafeParcelable.Param(id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.Param(id = 3) int i2, @InterfaceC11300zs1 @SafeParcelable.Param(id = 4) Bundle bundle) {
        this.d1 = false;
        this.e1 = true;
        this.X = i;
        this.Y = strArr;
        this.Y0 = cursorWindowArr;
        this.Z0 = i2;
        this.a1 = bundle;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Illegal instructions before constructor call */
    @KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DataHolder(@InterfaceC5670cr1 Cursor cursor, int i, @InterfaceC11300zs1 Bundle bundle) {
        this(r8, (CursorWindow[]) r1.toArray(new CursorWindow[r1.size()]), i, bundle);
        int i2;
        CursorWrapper cursorWrapper = new CursorWrapper(cursor);
        String[] columnNames = cursorWrapper.getColumnNames();
        ArrayList arrayList = new ArrayList();
        try {
            int count = cursorWrapper.getCount();
            CursorWindow window = cursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                i2 = 0;
            } else {
                window.acquireReference();
                cursorWrapper.a(null);
                arrayList.add(window);
                i2 = window.getNumRows();
            }
            while (i2 < count) {
                if (!cursorWrapper.moveToPosition(i2)) {
                    break;
                }
                CursorWindow window2 = cursorWrapper.getWindow();
                if (window2 != null) {
                    window2.acquireReference();
                    cursorWrapper.a(null);
                } else {
                    window2 = new CursorWindow(false);
                    window2.setStartPosition(i2);
                    cursorWrapper.fillWindow(i2, window2);
                }
                if (window2.getNumRows() == 0) {
                    break;
                }
                arrayList.add(window2);
                i2 = window2.getStartPosition() + window2.getNumRows();
            }
            cursorWrapper.close();
        } catch (Throwable th) {
            cursorWrapper.close();
            throw th;
        }
    }

    public DataHolder(Builder builder, int i, @InterfaceC11300zs1 Bundle bundle) {
        this(builder.a, c2(builder, -1), i, (Bundle) null);
    }

    @KeepForSdk
    public DataHolder(@InterfaceC5670cr1 String[] strArr, @InterfaceC5670cr1 CursorWindow[] cursorWindowArr, int i, @InterfaceC11300zs1 Bundle bundle) {
        this.d1 = false;
        this.e1 = true;
        this.X = 1;
        this.Y = (String[]) Preconditions.r(strArr);
        this.Y0 = (CursorWindow[]) Preconditions.r(cursorWindowArr);
        this.Z0 = i;
        this.a1 = bundle;
        M1();
    }
}
