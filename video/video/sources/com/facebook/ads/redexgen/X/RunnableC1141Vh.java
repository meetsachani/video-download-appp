package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o.C10928yK2;
import o.C2638Cg0;
import o.C8077mf;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Vh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1141Vh implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ T8 A00;
    public final /* synthetic */ C1144Vk A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-66, C2638Cg0.t7, -72, -6, -5, 5, 6, 1, 4, C8077mf.m, 3, -10, 1, 0, 3, 5, -6, -1, -8, C2638Cg0.B7, C2638Cg0.y7, C2638Cg0.E7, -35, C2638Cg0.y7, -37, -36, C2638Cg0.u7, -47, -52};
    }

    public RunnableC1141Vh(C1144Vk c1144Vk, String str, T8 t8) {
        this.A01 = c1144Vk;
        this.A02 = str;
        this.A00 = t8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        List list2;
        ArrayList arrayList;
        List list3;
        int i;
        int i2;
        int i3;
        if (WU.A02(this)) {
            return;
        }
        try {
            C1086Te nvl = new C1086Te(A00(0, 3, 84));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(A00(3, 7, 118), jSONArray);
            jSONObject.put(A00(19, 10, 76), this.A02);
            list = this.A01.A0D;
            synchronized (list) {
                list2 = this.A01.A0D;
                arrayList = new ArrayList(list2);
                list3 = this.A01.A0D;
                list3.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C1143Vj c1143Vj = (C1143Vj) it.next();
                StringBuilder append = new StringBuilder().append(A00(0, 0, 23));
                i = c1143Vj.A00;
                StringBuilder append2 = append.append(i).append(C10928yK2.l);
                i2 = c1143Vj.A02;
                StringBuilder append3 = append2.append(i2).append(C10928yK2.l);
                i3 = c1143Vj.A01;
                jSONArray.put(append3.append(i3).toString());
            }
            nvl.A07(jSONObject);
            nvl.A05(1);
            this.A00.A08().ABD(A00(10, 9, 117), AbstractC1085Td.A2R, nvl);
        } catch (JSONException unused) {
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
