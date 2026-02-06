package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class TopicOperation {
    @InterfaceC5056aJ2
    public static final String d = "!";
    public static final String e = "/topics/";
    public static final String f = "[a-zA-Z0-9-_.~%]{1,900}";
    public static final Pattern g = Pattern.compile(f);
    public final String a;
    public final String b;
    public final String c;

    public TopicOperation(String str, String str2) {
        this.a = d(str2, str);
        this.b = str;
        this.c = str + d + str2;
    }

    @InterfaceC11300zs1
    public static TopicOperation a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(d, -1);
        if (split.length != 2) {
            return null;
        }
        return new TopicOperation(split[0], split[1]);
    }

    @InterfaceC5670cr1
    public static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str != null && g.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, f));
    }

    public static TopicOperation f(@InterfaceC5670cr1 String str) {
        return new TopicOperation("S", str);
    }

    public static TopicOperation g(@InterfaceC5670cr1 String str) {
        return new TopicOperation("U", str);
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (!(obj instanceof TopicOperation)) {
            return false;
        }
        TopicOperation topicOperation = (TopicOperation) obj;
        if (!this.a.equals(topicOperation.a) || !this.b.equals(topicOperation.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.c(this.b, this.a);
    }
}
