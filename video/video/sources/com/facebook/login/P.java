package com.facebook.login;

import android.os.Bundle;
import android.util.Base64;
import com.facebook.C2416z;
import com.facebook.Z;
import com.facebook.internal.c0;
import com.facebook.internal.l0;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC10696xN1;
import o.C10219vQ1;
import o.C10662xF;
import o.C11197zR0;
import o.C3599Ly1;
import o.C5075aO1;
import o.C6562gT0;
import o.HB;
import o.InterfaceC9511sW0;
import o.VA;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class P {
    @NotNull
    public static final P a = new P();

    @InterfaceC9511sW0
    @NotNull
    public static final com.facebook.S a(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        C6562gT0.p(str, "authorizationCode");
        C6562gT0.p(str2, "redirectUri");
        C6562gT0.p(str3, "codeVerifier");
        Bundle bundle = new Bundle();
        bundle.putString("code", str);
        com.facebook.M m = com.facebook.M.a;
        bundle.putString("client_id", com.facebook.M.o());
        bundle.putString(c0.w, str2);
        bundle.putString("code_verifier", str3);
        com.facebook.S H = com.facebook.S.n.H(null, "oauth/access_token", null);
        H.q0(Z.GET);
        H.r0(bundle);
        return H;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String b(@NotNull String str, @NotNull EnumC2385b enumC2385b) throws C2416z {
        C6562gT0.p(str, "codeVerifier");
        C6562gT0.p(enumC2385b, "codeChallengeMethod");
        if (d(str)) {
            if (enumC2385b == EnumC2385b.PLAIN) {
                return str;
            }
            try {
                byte[] bytes = str.getBytes(HB.f);
                C6562gT0.o(bytes, "(this as java.lang.String).getBytes(charset)");
                MessageDigest messageDigest = MessageDigest.getInstance(l0.e);
                messageDigest.update(bytes, 0, bytes.length);
                String encodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                C6562gT0.o(encodeToString, "{\n      // try to generate challenge with S256\n      val bytes: ByteArray = codeVerifier.toByteArray(Charsets.US_ASCII)\n      val messageDigest = MessageDigest.getInstance(\"SHA-256\")\n      messageDigest.update(bytes, 0, bytes.size)\n      val digest = messageDigest.digest()\n\n      Base64.encodeToString(digest, Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP)\n    }");
                return encodeToString;
            } catch (Exception e) {
                throw new C2416z(e);
            }
        }
        throw new C2416z("Invalid Code Verifier.");
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String c() {
        int g1 = C5075aO1.g1(new C11197zR0(43, 128), AbstractC10696xN1.X);
        List H4 = C10662xF.H4(C10662xF.H4(C10662xF.H4(C10662xF.H4(C10662xF.G4(C10662xF.C4(new VA('a', 'z'), new VA('A', 'Z')), new VA(C3599Ly1.j, '9')), '-'), '.'), '_'), '~');
        ArrayList arrayList = new ArrayList(g1);
        for (int i = 0; i < g1; i++) {
            Character ch = (Character) C10662xF.N4(H4, AbstractC10696xN1.X);
            ch.charValue();
            arrayList.add(ch);
        }
        return C10662xF.p3(arrayList, "", null, null, 0, null, null, 62, null);
    }

    @InterfaceC9511sW0
    public static final boolean d(@Nullable String str) {
        if (str != null && str.length() != 0 && str.length() >= 43 && str.length() <= 128) {
            return new C10219vQ1("^[-._~A-Za-z0-9]+$").m(str);
        }
        return false;
    }
}
