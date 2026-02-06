package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.ads.androidx.media3.common.MediaItem;
import com.facebook.ads.androidx.media3.common.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.2u  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04262u {
    public static String[] A0B = {"HPaW60WB4gFqlzK247iq3uDphWK03Iif", "KBvaSaTKxPBSHh58MHpb5CG0KegQKkr9", "b1r5E5Hd4zdNoyuaEQVQsO4l4ctoImRB", "nKy6zg3qdMWmj624cOZmm65wxaqanW8E", "pbs", "7xj4kZWUPnGFCehZwFfpDVbkpfFBWPXP", "TYkILCf2Xs5AkCVGSR3QMYIpsRVtVxUs", "J3EyGmSR6mO6g6CSn2CxG4G4HI4UvZHg"};
    public Uri A00;
    public C2226q2 A04;
    public Object A05;
    public String A06;
    public String A07;
    public String A08;
    public C04272v A01 = new C04272v();
    public C04292x A02 = new C04292x();
    public List<StreamKey> A09 = Collections.emptyList();
    public List<MediaItem.SubtitleConfiguration> A0A = Collections.emptyList();
    public AnonymousClass30 A03 = new AnonymousClass30();

    public final C04262u A00(Uri uri) {
        this.A00 = uri;
        return this;
    }

    public final C04262u A01(Object obj) {
        this.A05 = obj;
        return this;
    }

    public final C04262u A02(String str) {
        this.A06 = str;
        return this;
    }

    public final C04262u A03(String str) {
        this.A07 = (String) AbstractC04543y.A01(str);
        return this;
    }

    public final C04262u A04(List<StreamKey> list) {
        List<StreamKey> emptyList;
        if (list != null) {
            boolean isEmpty = list.isEmpty();
            String[] strArr = A0B;
            if (strArr[1].charAt(26) == strArr[2].charAt(26)) {
                throw new RuntimeException();
            }
            A0B[3] = "MqTMGNvSZ5CI9kiBQqDgyIk0OkVIIG8t";
            if (!isEmpty) {
                emptyList = Collections.unmodifiableList(new ArrayList(list));
                this.A09 = emptyList;
                return this;
            }
        }
        emptyList = Collections.emptyList();
        this.A09 = emptyList;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2231q7 A05() {
        boolean z;
        Uri uri;
        if (C04292x.A00(this.A02) != null) {
            C04292x c04292x = this.A02;
            if (A0B[3].charAt(22) == '1') {
                throw new RuntimeException();
            }
            A0B[5] = "LsaTJZF6o4X1Tfg01qMfqEHPxyZhwdJj";
            if (C04292x.A03(c04292x) == null) {
                z = false;
                AbstractC04543y.A08(z);
                C2233q9 c2233q9 = null;
                uri = this.A00;
                if (uri != null) {
                    c2233q9 = new C2233q9(uri, this.A08, C04292x.A03(this.A02) != null ? this.A02.A08() : null, null, this.A09, this.A06, this.A0A, this.A05);
                }
                return new C2231q7(this.A07 == null ? this.A07 : "", this.A01.A0B(), c2233q9, this.A03.A05(), this.A04 == null ? this.A04 : C2226q2.A0Z);
            }
        }
        z = true;
        AbstractC04543y.A08(z);
        C2233q9 c2233q92 = null;
        uri = this.A00;
        if (uri != null) {
        }
        return new C2231q7(this.A07 == null ? this.A07 : "", this.A01.A0B(), c2233q92, this.A03.A05(), this.A04 == null ? this.A04 : C2226q2.A0Z);
    }
}
