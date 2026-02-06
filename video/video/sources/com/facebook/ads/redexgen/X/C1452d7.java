package com.facebook.ads.redexgen.X;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import java.util.Arrays;
import o.C3307Iz;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.d7  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1452d7 extends WebChromeClient {
    public static byte[] A01;
    public static String[] A02 = {"hD342XNQVEXChvJ41FuJYkzzL30E7V8C", "VFqqxEswv4BXF4BUDT4NnG4IAUyY785", "G3ZSvK9EmqC1e5u7Ivg7hdOkIQzdfa68", "vFWJ81dDNXk", "PGv8G8TosU31EXJAVb0WhvumqcSTUHDE", "JPUBUdUfGKDjW9Qe8mrAO5frWlzvQ1oz", "qcwfoFOZSGXVTY97XWLRaEh5jd9GG5ia", "FIykCHI4yyfel4YrSgGCK0Zn6vKmeZ"};
    public final /* synthetic */ C1457dC A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{64, 69, 66, 73, 98, 89, 65, 78, 73, 94, C3307Iz.Z, 47, 57, 57, C3307Iz.c0, C3307Iz.e0, 47, 118, 106, 112, 119, 102, 96, 76, 97};
    }

    static {
        A01();
    }

    public C1452d7(C1457dC c1457dC) {
        this.A00 = c1457dC;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        VI vi;
        C1444cz c1444cz;
        C1673gi c1673gi;
        if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A00(10, 7, 124), consoleMessage.message());
                jSONObject.put(A00(0, 10, 26), consoleMessage.lineNumber());
                jSONObject.put(A00(17, 8, 51), consoleMessage.sourceId());
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            vi = this.A00.A0D;
            vi.A04(VH.A0N, null);
            c1444cz = this.A00.A0E;
            c1444cz.A04(AbstractC1085Td.A14, jSONObject2);
            c1673gi = this.A00.A0B;
            c1673gi.A0F().A69(jSONObject2);
        }
        boolean onConsoleMessage = super.onConsoleMessage(consoleMessage);
        if (A02[5].charAt(17) != '8') {
            A02[3] = "bhT1kVUsfNz";
            return onConsoleMessage;
        }
        throw new RuntimeException();
    }
}
