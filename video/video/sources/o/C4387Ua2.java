package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Deprecated
/* renamed from: o.Ua2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4387Ua2 extends AbstractC4193Sa2 {
    public static final Parcelable.Creator<C4387Ua2> CREATOR = new a();
    public final long X;
    public final boolean Y;
    public final boolean Y0;
    public final boolean Z;
    public final boolean Z0;
    public final long a1;
    public final long b1;
    public final List<b> c1;
    public final boolean d1;
    public final long e1;
    public final int f1;
    public final int g1;
    public final int h1;

    /* renamed from: o.Ua2$a */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<C4387Ua2> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4387Ua2 createFromParcel(Parcel parcel) {
            return new C4387Ua2(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C4387Ua2[] newArray(int i) {
            return new C4387Ua2[i];
        }
    }

    /* renamed from: o.Ua2$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public final int a;
        public final long b;
        public final long c;

        public /* synthetic */ b(int i, long j, long j2, a aVar) {
            this(i, j, j2);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.a);
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
        }

        public b(int i, long j, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }
    }

    public /* synthetic */ C4387Ua2(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static C4387Ua2 a(C3012Fy1 c3012Fy1, long j, C10071up2 c10071up2) {
        boolean z;
        List list;
        long j2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        long j3;
        boolean z10;
        boolean z11;
        int i4;
        long j4;
        long N = c3012Fy1.N();
        if ((c3012Fy1.L() & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        List list2 = Collections.EMPTY_LIST;
        long j5 = C10323vs.b;
        if (!z) {
            int L = c3012Fy1.L();
            if ((L & 128) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((L & 64) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if ((L & 32) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((L & 16) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z7 && !z9) {
                j3 = C4637Wo2.b(c3012Fy1, j);
            } else {
                j3 = -9223372036854775807L;
            }
            if (!z7) {
                int L2 = c3012Fy1.L();
                ArrayList arrayList = new ArrayList(L2);
                int i5 = 0;
                while (i5 < L2) {
                    int L3 = c3012Fy1.L();
                    if (!z9) {
                        i4 = L2;
                        j4 = C4637Wo2.b(c3012Fy1, j);
                    } else {
                        i4 = L2;
                        j4 = -9223372036854775807L;
                    }
                    arrayList.add(new b(L3, j4, c10071up2.b(j4), null));
                    i5++;
                    L2 = i4;
                }
                list2 = arrayList;
            }
            if (z8) {
                long L4 = c3012Fy1.L();
                if ((128 & L4) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j5 = ((((L4 & 1) << 32) | c3012Fy1.N()) * 1000) / 90;
                z10 = z11;
            } else {
                z10 = false;
            }
            int R = c3012Fy1.R();
            long j6 = j3;
            j2 = j5;
            j5 = j6;
            i2 = c3012Fy1.L();
            i3 = c3012Fy1.L();
            i = R;
            z5 = z10;
            z2 = z6;
            z3 = z7;
            list = list2;
            z4 = z9;
        } else {
            list = list2;
            j2 = -9223372036854775807L;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        return new C4387Ua2(N, z, z2, z3, z4, j5, c10071up2.b(j5), list, z5, j2, i, i2, i3);
    }

    @Override // o.AbstractC4193Sa2
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.a1 + ", programSplicePlaybackPositionUs= " + this.b1 + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.X);
        parcel.writeByte(this.Y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.Z ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.Y0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.Z0 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.a1);
        parcel.writeLong(this.b1);
        int size = this.c1.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.c1.get(i2).b(parcel);
        }
        parcel.writeByte(this.d1 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.e1);
        parcel.writeInt(this.f1);
        parcel.writeInt(this.g1);
        parcel.writeInt(this.h1);
    }

    public C4387Ua2(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<b> list, boolean z5, long j4, int i, int i2, int i3) {
        this.X = j;
        this.Y = z;
        this.Z = z2;
        this.Y0 = z3;
        this.Z0 = z4;
        this.a1 = j2;
        this.b1 = j3;
        this.c1 = Collections.unmodifiableList(list);
        this.d1 = z5;
        this.e1 = j4;
        this.f1 = i;
        this.g1 = i2;
        this.h1 = i3;
    }

    public C4387Ua2(Parcel parcel) {
        this.X = parcel.readLong();
        this.Y = parcel.readByte() == 1;
        this.Z = parcel.readByte() == 1;
        this.Y0 = parcel.readByte() == 1;
        this.Z0 = parcel.readByte() == 1;
        this.a1 = parcel.readLong();
        this.b1 = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(b.a(parcel));
        }
        this.c1 = Collections.unmodifiableList(arrayList);
        this.d1 = parcel.readByte() == 1;
        this.e1 = parcel.readLong();
        this.f1 = parcel.readInt();
        this.g1 = parcel.readInt();
        this.h1 = parcel.readInt();
    }
}
