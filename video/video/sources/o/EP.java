package o;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class EP extends AbstractC10113v0 {
    public static final String e = "\\b[0-9a-fA-F]{8}\\b-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-\\b[0-9a-fA-F]{12}\\b";

    public EP(Locale locale) {
        super(UUID.class, null, null, locale);
    }

    @Override // o.ER
    public Object a(String str) throws JR {
        if (C4500Ve2.H0(str)) {
            return null;
        }
        String trim = str.trim();
        if (Pattern.matches(e, trim)) {
            return UUID.fromString(trim);
        }
        throw new JR(str, this.a, String.format(ResourceBundle.getBundle(UI0.k).getString("invalid.uuid.value"), str, this.a.getName()));
    }
}
