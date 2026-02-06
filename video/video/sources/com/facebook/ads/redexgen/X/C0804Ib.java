package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C10323vs;

/* renamed from: com.facebook.ads.redexgen.X.Ib */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0804Ib {
    public static String[] A0B = {"nEg82cXZVYZFfZdDmhKyBuPXw98CjCqr", "lWWNRS3KueXb9Tbf73wyUq3w1CVt7zYo", "9i1TifP67Pthfk8s9WN", "2Mfz8aUpVuODbM0LRRY7IzxNE33rrKDp", "lWmgQQDKaNBy8Pu2POQEfpeN2vAsVVBR", "WAUg7lL5KFyy4cAmNpLa1cxU0cT6TIeS", "jMg6XDLnbUHNrmDX3ZR", "RwGxvdCbKX59SF6mGNLLwZG43nCYkk8W"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List<C0803Ia> A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C0804Ib A02(C04774v c04774v) {
        long A0Q = c04774v.A0Q();
        boolean z = (c04774v.A0I() & 128) != 0;
        boolean z2 = false;
        boolean z3 = false;
        long j = C10323vs.b;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z4 = false;
        long j2 = C10323vs.b;
        if (!z) {
            int A0I = c04774v.A0I();
            z2 = (A0I & 128) != 0;
            z3 = (A0I & 64) != 0;
            if (A0B[3].charAt(19) != '7') {
                throw new RuntimeException();
            }
            String[] strArr = A0B;
            strArr[0] = "nLO0WJRxYuU9qthfzcYyP1P8ccIGaxOi";
            strArr[1] = "OIpoqKTSq2Ia2FsBUXzy5KxMNemzaoxr";
            boolean z5 = (A0I & 32) != 0;
            if (z3) {
                j = c04774v.A0Q();
            }
            if (!z3) {
                int A0I2 = c04774v.A0I();
                arrayList = new ArrayList(A0I2);
                for (int i4 = 0; i4 < A0I2; i4++) {
                    arrayList.add(new C0803Ia(c04774v.A0I(), c04774v.A0Q(), null));
                }
                if (A0B[3].charAt(19) == '7') {
                    A0B[4] = "ZIJV8CxCO5lc3X0ct1XMotdLhBio9GzL";
                }
            }
            if (z5) {
                long A0I3 = c04774v.A0I();
                z4 = (128 & A0I3) != 0;
                j2 = (1000 * (((1 & A0I3) << 32) | c04774v.A0Q())) / 90;
            }
            i = c04774v.A0M();
            i2 = c04774v.A0I();
            i3 = c04774v.A0I();
        }
        return new C0804Ib(A0Q, z, z2, z3, arrayList, j, z4, j2, i, i2, i3);
    }

    public C0804Ib(long j, boolean z, boolean z2, boolean z3, List<C0803Ia> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
        this.A04 = j;
        this.A0A = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A06 = Collections.unmodifiableList(list);
        this.A05 = j2;
        this.A07 = z4;
        this.A03 = j3;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public C0804Ib(Parcel parcel) {
        C0803Ia A00;
        this.A04 = parcel.readLong();
        this.A0A = parcel.readByte() == 1;
        this.A08 = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            A00 = C0803Ia.A00(parcel);
            arrayList.add(A00);
        }
        this.A06 = Collections.unmodifiableList(arrayList);
        this.A05 = parcel.readLong();
        int componentSpliceListLength = parcel.readByte();
        this.A07 = componentSpliceListLength == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListLength2 = parcel.readInt();
        this.A02 = componentSpliceListLength2;
        int componentSpliceListLength3 = parcel.readInt();
        this.A00 = componentSpliceListLength3;
        int componentSpliceListLength4 = parcel.readInt();
        this.A01 = componentSpliceListLength4;
    }

    public static C0804Ib A00(Parcel parcel) {
        return new C0804Ib(parcel);
    }

    public static /* synthetic */ C0804Ib A01(Parcel parcel) {
        return A00(parcel);
    }

    public static /* synthetic */ C0804Ib A03(C04774v c04774v) {
        return A02(c04774v);
    }

    public void A04(Parcel parcel) {
        parcel.writeLong(this.A04);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        int size = this.A06.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            this.A06.get(i).A02(parcel);
        }
        parcel.writeLong(this.A05);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        int componentSpliceListSize = this.A02;
        parcel.writeInt(componentSpliceListSize);
        int componentSpliceListSize2 = this.A00;
        parcel.writeInt(componentSpliceListSize2);
        int componentSpliceListSize3 = this.A01;
        parcel.writeInt(componentSpliceListSize3);
    }

    public static /* synthetic */ void A05(C0804Ib c0804Ib, Parcel parcel) {
        c0804Ib.A04(parcel);
    }
}
