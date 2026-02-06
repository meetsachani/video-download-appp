package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import o.C2638Cg0;

/* renamed from: com.facebook.ads.redexgen.X.j2  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1812j2 extends AbstractRunnableC1160Wc {
    public static byte[] A03;
    public static String[] A04 = {"7HAtzWHHqocdVWrHWLF7dHgS7Bm2h12C", "DbOr4ijtOwCAaeVmvR816jBzMEkuu4t1", "lnUtOUEm1wuvoR9nZTKEc7Wj6", "rgunTSV1g2reSAbvPi4FwUaf05Z1esdk", "lf9TdmWUJKPBCDTsH0x6g9hItkASR1Wu", "rzwaJSO2zPm7h9LPx5qAuh7aJhmBGJeQ", "21sK4Gi1tfVdwS7GyFfEScwosNwGd1WZ", "FSSaRzfmWACYGxNNk9yD6VAWr"};
    public N1 A00;
    public String A01;
    public final /* synthetic */ C05447k A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 4);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {C2638Cg0.o7, -29, -32, -17, -13, -28, -15, -97, -13, -24, -20, -28, -18, -12, -13, -83};
        String[] strArr = A04;
        if (strArr[6].charAt(4) != strArr[1].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[5] = "osBBqT7uNXEQnnthAEoQEGxFzU3x5jcE";
        strArr2[0] = "83ZlJzScQovvXu1byfPC9cIolLTrcwle";
        A03 = bArr;
    }

    static {
        A01();
    }

    public C1812j2(C05447k c05447k, N1 n1, String str) {
        this.A02 = c05447k;
        this.A00 = n1;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        this.A02.A0V(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.ADp(new C1145Vm(AdErrorType.NETWORK_ERROR, A00(0, 16, 123)));
    }
}
