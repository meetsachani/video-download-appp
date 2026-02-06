package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o.C3307Iz;

/* loaded from: assets/audience_network/classes2.dex */
public final class X9 implements OW {
    public static X9 A01;
    public static byte[] A02;
    public static String[] A03 = {"JA9mFndCctStcDzVBolZEhplBWXHl3GV", "NcYgt8CJQWeZTs6r7gmN4DT79HnpXepC", "3XxDtH0VTaUV7XfCs333UHSSC4s6Co3p", "GzYduKaWaeKhPeumV22hkK4VttJt2TZR", "1SSiXu0qt70LSSG", "DSz0vhavMIehNnnYUsD24XzaqUk6jyxA", "cWkBnlzylFFk2PvMzvfAX6O9wvYh3tUg", "DdhgMLh6mU1KSfIF9B7woVtLM"};
    public static final String A04;
    public final LinkedHashMap<String, V2> A00 = new LinkedHashMap<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{74, 93, 70, 76, 68, 77, 87, 77, 80, 92, 90, 73, 91, 87, 67, 77, 81, 6, C3307Iz.Z, 49, 54, 48, C3307Iz.e0, 59, C3307Iz.Z, C3307Iz.Y, 98, 3, C3307Iz.Y, 98, 112, 119, 113, 124, 98, 103, 124, 106, 103, 124, 104, 102, 122};
    }

    static {
        A02();
        A04 = X9.class.getSimpleName();
    }

    public static X9 A00() {
        if (A01 == null) {
            A01 = new X9();
        }
        return A01;
    }

    public final OG A03(String str) {
        V2 adRecord = this.A00.get(str);
        if (adRecord != null) {
            return adRecord.A00;
        }
        String[] strArr = A03;
        if (strArr[1].charAt(31) != strArr[2].charAt(31)) {
            String[] strArr2 = A03;
            strArr2[3] = "XrwELTKduoHwTv5Xe9Ueh6lc6nYoGsk4";
            strArr2[0] = "dmw4t0heQzRKMH67OrdKuJovyCEl55Ve";
            return null;
        }
        throw new RuntimeException();
    }

    public final V2 A04(String str) {
        return this.A00.get(str);
    }

    public final V2 A05(String str, Messenger messenger, String str2) {
        V2 v2 = new V2(str, messenger, str2);
        this.A00.put(str, v2);
        return v2;
    }

    public final void A06() {
        Iterator<Map.Entry<String, V2>> it = this.A00.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A03;
            if (strArr[5].charAt(17) == strArr[6].charAt(17)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "uaiMeFYOk8P5CT6awQd5iZTKLUhraaN2";
            strArr2[6] = "RG3ipiEhElKk8ivC3FwrEM9mKg3mEr0b";
            if (hasNext) {
                OG og = it.next().getValue().A00;
                if (og != null) {
                    og.destroy();
                }
                it.remove();
            } else {
                return;
            }
        }
    }

    public final void A07(int i, String str, Bundle bundle, Messenger messenger) {
        try {
            Message obtain = Message.obtain((Handler) null, i);
            if (str != null) {
                obtain.getData().putString(A01(30, 13, 95), str);
            }
            if (bundle != null) {
                obtain.getData().putBundle(A01(0, 17, 116), bundle);
            }
            messenger.send(obtain);
        } catch (RemoteException unused) {
            if (str != null) {
                A08(str);
            }
        }
    }

    public final void A08(String str) {
        V2 v2 = this.A00.get(str);
        if (v2 != null && v2.A00 != null) {
            String str2 = A01(17, 13, 62) + str;
            v2.A00.destroy();
            this.A00.remove(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.OW
    public final void AEs(int i, String str, Bundle bundle) {
        V2 adRecord = A04(str);
        if (adRecord != null) {
            A07(i, str, bundle, adRecord.A02);
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, V2> entry : this.A00.entrySet()) {
            V2 value = entry.getValue();
            try {
                value.A02.send(Message.obtain((Handler) null, 3));
            } catch (RemoteException unused) {
                hashSet.add(value.A03);
            }
        }
        Iterator it = hashSet.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A03;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "oay5V0mz6qjd0xRXPgrRbPRiLoP0UxTC";
            strArr2[6] = "83Bq2rwwej5lQl4xIjWhMW1frgDiuUFT";
            if (hasNext) {
                A08((String) it.next());
            } else {
                return;
            }
        }
    }
}
