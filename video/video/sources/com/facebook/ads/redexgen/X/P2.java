package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import o.C10997yd1;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C8077mf;
import o.QC1;

/* loaded from: assets/audience_network/classes2.dex */
public final class P2 {
    public static P2 A05;
    public static byte[] A06;
    public static final Object A07;
    public final Context A00;
    public final Handler A01;
    public final HashMap<BroadcastReceiver, ArrayList<P1>> A04 = new HashMap<>();
    public final HashMap<String, ArrayList<P1>> A03 = new HashMap<>();
    public final ArrayList<P0> A02 = new ArrayList<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 63);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{C8077mf.m, C8077mf.m, 109, 66, 71, 95, 78, 89, C8077mf.m, 79, 66, 79, C8077mf.m, 69, 68, 95, C8077mf.m, 70, 74, 95, 72, 67, 17, C8077mf.m, 95, 95, 57, C8077mf.z, 19, C8077mf.m, C8077mf.D, 13, 95, C8077mf.u, C8077mf.H, C8077mf.m, 28, C8077mf.A, C8077mf.D, C8077mf.E, 94, 95, 95, C8077mf.u, C8077mf.H, C8077mf.m, 28, C8077mf.A, 66, 79, 7, 42, 101, 108, 42, 99, 100, 126, 111, 100, 126, 42, C3307Iz.X, 118, 102, 109, 96, 104, 96, C3307Iz.X, 86, 116, 99, 126, QC1.w, 121, 55, 123, 126, 100, 99, C3307Iz.e0, 55, 84, 119, 123, 121, 116, 90, 106, 119, 121, 124, 123, 121, 107, 108, 85, 121, 118, 121, Byte.MAX_VALUE, 125, 106, C8077mf.B, 52, C3307Iz.V, 54, C4715Xk.i, 60, 59, 50, 117, 52, 50, 52, 60, 59, C3307Iz.Y, C3307Iz.V, 117, 51, 60, 57, C3307Iz.V, 48, C3307Iz.Z, 117, C8077mf.B, 47, 57, C3307Iz.X, C3307Iz.Y, 60, 35, 36, C3307Iz.e0, 106, 62, 51, 58, 47, 106, 56, 58, C3307Iz.e0, 48, 54, 55, 78, 76, 89, 72, 74, 66, 95, 84, C8077mf.n, 9, 28, 9, 72, 69, 76, 89, 91, 64, 69, 64, 65, 89, 64, C8077mf.p, 92, 75, 79, 93, 65, 64};
    }

    static {
        A03();
        A07 = new Object();
    }

    public P2(Context context) {
        this.A00 = context;
        this.A01 = new HandlerC0982Oz(this, context.getMainLooper());
    }

    public static P2 A00(Context context) {
        P2 p2;
        synchronized (A07) {
            if (A05 == null) {
                A05 = new P2(context.getApplicationContext());
            }
            p2 = A05;
        }
        return p2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Incorrect condition in loop: B:12:0x001c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A02() {
        P0[] p0Arr;
        while (true) {
            synchronized (this.A04) {
                int size = this.A02.size();
                if (size > 0) {
                    p0Arr = new P0[size];
                    this.A02.toArray(p0Arr);
                    this.A02.clear();
                } else {
                    return;
                }
            }
            for (P0 p0 : p0Arr) {
                int j = p0.A01.size();
                for (int nbr = 0; nbr < j; nbr++) {
                    P1 p1 = p0.A01.get(nbr);
                    if (!p1.A01) {
                        p1.A02.onReceive(this.A00, p0.A00);
                    }
                }
            }
        }
    }

    public final void A05(BroadcastReceiver broadcastReceiver) {
        synchronized (this.A04) {
            ArrayList<P1> remove = this.A04.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                P1 p1 = remove.get(size);
                p1.A01 = true;
                for (int j = 0; j < p1.A03.countActions(); j++) {
                    String action = p1.A03.getAction(j);
                    ArrayList<P1> arrayList = this.A03.get(action);
                    if (arrayList != null) {
                        int i = arrayList.size();
                        for (int i2 = i - 1; i2 >= 0; i2--) {
                            P1 p12 = arrayList.get(i2);
                            if (p12.A02 == broadcastReceiver) {
                                p12.A01 = true;
                                arrayList.remove(i2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.A03.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void A06(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.A04) {
            P1 p1 = new P1(intentFilter, broadcastReceiver);
            ArrayList<P1> arrayList = this.A04.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.A04.put(broadcastReceiver, arrayList);
            }
            arrayList.add(p1);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<P1> arrayList2 = this.A03.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.A03.put(action, arrayList2);
                }
                arrayList2.add(p1);
            }
        }
    }

    public final boolean A07(Intent intent) {
        String A01;
        synchronized (this.A04) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.A00.getContentResolver());
            Uri data = intent.getData();
            String action2 = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean debug = (intent.getFlags() & 8) != 0;
            if (debug) {
                StringBuilder sb = new StringBuilder();
                String type = A01(128, 15, 117);
                StringBuilder append = sb.append(type).append(resolveTypeIfNeeded);
                String type2 = A01(62, 8, 58);
                StringBuilder append2 = append.append(type2).append(action2);
                String type3 = A01(51, 11, 53);
                append2.append(type3).append(intent).toString();
            }
            HashMap<String, ArrayList<P1>> hashMap = this.A03;
            String type4 = intent.getAction();
            ArrayList<P1> arrayList = hashMap.get(type4);
            if (arrayList != null) {
                if (debug) {
                    StringBuilder sb2 = new StringBuilder();
                    String type5 = A01(70, 13, 40);
                    sb2.append(type5).append(arrayList).toString();
                }
                ArrayList arrayList2 = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    P1 p1 = arrayList.get(i);
                    if (debug) {
                        StringBuilder sb3 = new StringBuilder();
                        String type6 = A01(104, 24, 106);
                        sb3.append(type6).append(p1.A03).toString();
                    }
                    if (!p1.A00) {
                        int match = p1.A03.match(action, resolveTypeIfNeeded, action2, data, categories, A01(83, 21, 39));
                        if (match >= 0) {
                            if (debug) {
                                String str = A01(24, 27, 64) + Integer.toHexString(match);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(p1);
                            p1.A00 = true;
                        } else if (debug) {
                            switch (match) {
                                case -4:
                                    A01 = A01(149, 8, 18);
                                    break;
                                case -3:
                                    A01 = A01(C3503Kz.g0, 6, 102);
                                    break;
                                case -2:
                                    A01 = A01(C3503Kz.q0, 4, 87);
                                    break;
                                case -1:
                                    A01 = A01(C10997yd1.q1, 4, 3);
                                    break;
                                default:
                                    A01 = A01(C10997yd1.v1, 14, 17);
                                    break;
                            }
                            String str2 = A01(0, 24, 20) + A01;
                        }
                    }
                }
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        ((P1) arrayList2.get(i2)).A00 = false;
                    }
                    this.A02.add(new P0(intent, arrayList2));
                    if (!this.A01.hasMessages(1)) {
                        this.A01.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
