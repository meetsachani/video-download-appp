package com.facebook.ads.androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.AnonymousClass53;
import com.facebook.ads.redexgen.X.C04774v;
import com.facebook.ads.redexgen.X.C0805Ic;
import o.C10323vs;

/* loaded from: assets/audience_network/classes2.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static String[] A02 = {"fBCCr7VwDgvhDxdGkzRiY2TvWvmZmARS", "lBD0fDkRFVdGPYWDbMcaGx4cyXv4WEJh", "6y4HJXgmtxqVkaNMzYZBmSXA6CGxm4DJ", "vpsLDrGqE5zherZQZMMLL6G3cLRsG8Dm", "qp0fDGr3Nzl8ahCuvet6k2311zos", "c5cBfT4Hj52dvZvyRqGaKhWxL68ft04u", "OtVyWYxYdMxR9geYu5t1Sc80NPuk", "8DkmlbSWSEaEI0nee1I51BPAFd"};
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new C0805Ic();
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public /* synthetic */ TimeSignalCommand(long j, long j2, C0805Ic c0805Ic) {
        this(j, j2);
    }

    public static long A00(C04774v c04774v, long j) {
        long A0I = c04774v.A0I();
        if ((128 & A0I) == 0) {
            return C10323vs.b;
        }
        long firstByte = c04774v.A0Q();
        long j2 = (((1 & A0I) << 32) | firstByte) + j;
        if (A02[7].length() != 21) {
            String[] strArr = A02;
            strArr[5] = "5vtaLYhnTEc2lUg08l0YEv2QqnnKhzp8";
            strArr[0] = "gGhCeZV4kOFdoFbuN1d60dh6MMvStMtQ";
            return j2 & 8589934591L;
        }
        throw new RuntimeException();
    }

    public static TimeSignalCommand A01(C04774v c04774v, long j, AnonymousClass53 anonymousClass53) {
        long A00 = A00(c04774v, j);
        return new TimeSignalCommand(A00, anonymousClass53.A06(A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
