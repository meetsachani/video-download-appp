package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;
import android.content.Context;
import java.util.Arrays;
import java.util.List;
import o.C2638Cg0;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.Wp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1172Wp {
    public static byte[] A00;
    public static String[] A01 = {"vserbkQ71L70HeExkEksLvSV50Js9e5T", "kCtue8tdTX7Ntsd63evdhPLiI5GlGyVZ", "TwC9DE0UkCmO5xuA9ppRryz5QvyD", "4CWs1R6rr7PkkffzytFACCqk28rMKWqF", "DS0L0fcRoHYALrKB9SSkXSb7384LvFtu", "e8tzsRThNax4EAToJhNq21dAKBpwgTLo", "Q0BiPrkB2PSWzVDnLZTkEnIKaCsuaheD", "rbmY91JFcJMC4pCqNbunWn9nQrXHl54t"};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[6].charAt(20) == strArr[1].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "hlZJhcxljYiKc7UKHZyQNCRGeosS0rVV";
            strArr2[7] = "L6Z1FseRPLChQnX48wkOINplJZHgpjkr";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 49);
            i4++;
        }
    }

    public static void A03() {
        A00 = new byte[]{-37, -35, -18, -29, -16, -29, -18, -13, -1, C8077mf.n, 2, C8077mf.r, 13, 7, 2, -52, 7, C8077mf.n, C8077mf.u, 3, C8077mf.n, C8077mf.u, -52, 1, -1, C8077mf.u, 3, 5, 13, C8077mf.r, C8077mf.A, -52, -22, -33, -13, -20, C2638Cg0.C7, -26, -29, -16};
    }

    static {
        A03();
    }

    public static EnumC1171Wo A00(Context context) {
        try {
            return A01(context);
        } catch (Exception unused) {
            return EnumC1171Wo.A05;
        }
    }

    public static EnumC1171Wo A01(Context context) {
        if (context == null) {
            return EnumC1171Wo.A0D;
        }
        ActivityManager mgr = (ActivityManager) context.getSystemService(A02(0, 8, 73));
        if (mgr == null) {
            EnumC1171Wo enumC1171Wo = EnumC1171Wo.A08;
            if (A01[0].charAt(27) != 'o') {
                A01[2] = "W800VLcbCNBOE1f9F";
                return enumC1171Wo;
            }
            throw new RuntimeException();
        }
        List<ActivityManager.AppTask> tasks = mgr.getAppTasks();
        if (tasks.isEmpty()) {
            return EnumC1171Wo.A0B;
        }
        for (ActivityManager.AppTask appTask : tasks) {
            ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
            if (taskInfo != null && taskInfo.baseIntent != null && taskInfo.baseIntent.getCategories() != null && taskInfo.baseIntent.getCategories().contains(A02(8, 32, 109))) {
                return EnumC1171Wo.A06;
            }
        }
        EnumC1171Wo enumC1171Wo2 = EnumC1171Wo.A09;
        String[] strArr = A01;
        if (strArr[3].charAt(22) != strArr[5].charAt(22)) {
            String[] strArr2 = A01;
            strArr2[4] = "GyHEsdoLJV3XEjiFxTFX6orc2Mvnrd3k";
            strArr2[7] = "nU2m6dMK7qfy4atV1JxTmvIeg7zDsgbu";
            return enumC1171Wo2;
        }
        throw new RuntimeException();
    }
}
