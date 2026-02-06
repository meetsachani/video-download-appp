package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi;
import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;
import org.json.JSONObject;

/* loaded from: assets/audience_network/classes2.dex */
public final class V5 extends Handler {
    public static byte[] A04;
    public static String[] A05 = {"4udqyVbWZXJvSc0AlbflTWwfFOYrDaDf", "2YLZ8zu95yTf3T209", "2VJPb0Yp69Qd6undQokFBSWI7sS3NGkE", "Nq0QHebF7aCImjCS8", "WfWu3jj6ZslW8HMUv7JinXygwhejXyBb", "C4PEiJW5iwJTin2vYgbWRkUl1o", "sWvNSKALPWxj", "lJrPEKSWvzui7DJNo"};
    public static final String A06;
    public final Context A00;
    public final AudienceNetworkRemoteServiceApi.MessageHandler A01;
    public final AudienceNetworkRemoteServiceApi.PackageVerifier A02;
    public final X9 A03;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 102);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        byte[] bArr = {-8, -16, -12, -13, -16, -14, -66, C2638Cg0.x7, C2638Cg0.x7, -56, -37, C2638Cg0.s7, C2638Cg0.A7, -37, C2638Cg0.q7, -47, C2638Cg0.w7, C2638Cg0.w7, C2638Cg0.p7, -56, -37, -56, C2638Cg0.x7, C2638Cg0.r7, C2638Cg0.r7, C2638Cg0.p7, C2638Cg0.o7, -13, -12, -14, -1, C2638Cg0.C7, -28, -1, -23, -28, -1, -21, -27, -7, 17, C8077mf.u, C8077mf.r, C8077mf.G, 0, 19, C8077mf.n, 2, 10, 3, C8077mf.G, 9, 3, C8077mf.A, -48, -47, C2638Cg0.A7, -36, -48, C2638Cg0.q7, C2638Cg0.A7, -45, C2638Cg0.t7, C2638Cg0.o7, C2638Cg0.q7, -36, C2638Cg0.q7, -43, -47, C2638Cg0.A7, -66, -48, C8077mf.y, C8077mf.z, C8077mf.x, C3307Iz.V, C8077mf.y, 7, C8077mf.x, C8077mf.B, C8077mf.m, 5, 7, C3307Iz.V, C8077mf.y, 6, 13, C3307Iz.V, C8077mf.B, 7, C8077mf.x, C8077mf.y, C8077mf.m, 17, C8077mf.r};
        if (A05[5].length() == 23) {
            throw new RuntimeException();
        }
        A05[5] = "AJ3";
        A04 = bArr;
    }

    static {
        A04();
        A06 = V5.class.getSimpleName();
    }

    public V5(Context context, AudienceNetworkRemoteServiceApi.MessageHandler messageHandler, AudienceNetworkRemoteServiceApi.PackageVerifier packageVerifier) {
        super(Looper.getMainLooper());
        this.A00 = context;
        this.A02 = packageVerifier;
        this.A03 = X9.A00();
        this.A01 = messageHandler;
    }

    public static Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putString(A03(72, 23, 92), A03(0, 6, 92));
        bundle.putString(A03(54, 18, 23), new JSONObject().toString());
        return bundle;
    }

    private C1788id A01(C1783iY c1783iY, String str) {
        C1788id c1788id = new C1788id(c1783iY, this.A03, str);
        c1788id.A0G(c1783iY.A0B(), c1783iY.A07());
        return c1788id;
    }

    private C1784iZ A02(C1768iI c1768iI, String str) {
        C1784iZ c1784iZ = new C1784iZ(c1768iI, this.A03, str);
        c1784iZ.A0J(c1768iI.A05, c1768iI.A02, c1768iI.A08);
        return c1784iZ;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        String str;
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A01 != null && this.A01.handleMessage(msg)) {
                return;
            }
            Messenger messenger = msg.replyTo;
            if (msg.what == 1) {
                if (messenger != null) {
                    X9.A00().A07(2, null, A00(), messenger);
                    return;
                }
                return;
            }
            String callingAppPackage = msg.getData().getString(A03(27, 13, 58));
            if (callingAppPackage == null) {
                return;
            }
            C1673gi A052 = C1046Rp.A05(this.A00, callingAppPackage);
            A052.A0F().AJS(msg.getData().getBoolean(A03(6, 21, 22), false));
            if (this.A02 != null) {
                str = this.A02.verifyPackage(this.A00, msg, msg.getData().getString(A03(40, 14, 88)));
            } else {
                str = null;
            }
            if (str == null) {
                if (messenger != null) {
                    X9.A00().A07(20, callingAppPackage, null, messenger);
                }
                A052.A0F().AHv();
                return;
            }
            switch (msg.what) {
                case 1010:
                    if (messenger == null) {
                        return;
                    }
                    V2 A042 = X9.A00().A04(callingAppPackage);
                    if (A042 == null) {
                        A042 = X9.A00().A05(callingAppPackage, messenger, str);
                    }
                    C1783iY intAdModel = OX.A04(A052, msg.getData(), str);
                    if (A042.A00 == null) {
                        A042.A00 = A01(intAdModel, callingAppPackage);
                    } else if (A042.A00 instanceof C1788id) {
                        ((C1788id) A042.A00).A0G(intAdModel.A0B(), intAdModel.A07());
                    }
                    X9.A00().A07(1011, callingAppPackage, A00(), messenger);
                    return;
                case 1012:
                case 2002:
                    X9.A00().A08(callingAppPackage);
                    return;
                case 2000:
                    if (messenger == null) {
                        return;
                    }
                    V2 A043 = X9.A00().A04(callingAppPackage);
                    if (A043 == null) {
                        A043 = X9.A00().A05(callingAppPackage, messenger, str);
                    }
                    C1768iI A053 = OX.A05(A052, msg.getData(), str);
                    if (A043.A00 == null) {
                        A043.A00 = A02(A053, callingAppPackage);
                    } else if (A043.A00 instanceof C1784iZ) {
                        String adId = A053.A05;
                        ((C1784iZ) A043.A00).A0J(adId, A053.A02, A053.A08);
                    }
                    X9.A00().A07(2001, callingAppPackage, A00(), messenger);
                    return;
                case 2003:
                    OG A03 = X9.A00().A03(callingAppPackage);
                    if (A03 instanceof C1784iZ) {
                        RewardData A01 = OY.A01(msg.getData());
                        C1784iZ c1784iZ = (C1784iZ) A03;
                        if (A01 != null) {
                            c1784iZ.A0I(A01);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Throwable th) {
            if (A05[5].length() == 23) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "nIV8RMn07Ah5";
            strArr[1] = "ZacTvu5dUvRq7FGBf";
            WU.A00(th, this);
        }
    }
}
