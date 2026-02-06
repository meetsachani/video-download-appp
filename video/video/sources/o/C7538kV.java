package o;

import android.os.Build;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.kV  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7538kV {
    @NotNull
    public static final C7538kV a = new C7538kV();

    @Nullable
    public final ZonedDateTime a(@NotNull String str) {
        DateTimeFormatter ofPattern;
        ZonedDateTime parse;
        C6562gT0.p(str, "isoDate");
        if (Build.VERSION.SDK_INT >= 26) {
            ofPattern = DateTimeFormatter.ofPattern(com.facebook.S.P);
            C6562gT0.o(ofPattern, "ofPattern(\"yyyy-MM-dd'T'HH:mm:ssZ\")");
            parse = ZonedDateTime.parse(str, ofPattern);
            return parse;
        }
        return null;
    }
}
