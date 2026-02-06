package o;

/* loaded from: classes3.dex */
public final class KV {
    public static final String b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\"') {
                sb.append("\\\"");
            } else if (charAt == '\\') {
                sb.append("\\\\");
            } else if (charAt == '\b') {
                sb.append("\\b");
            } else if (charAt == '\n') {
                sb.append("\\n");
            } else if (charAt == '\r') {
                sb.append("\\r");
            } else if (charAt == '\t') {
                sb.append("\\t");
            } else {
                sb.append(charAt);
            }
        }
        sb.append('\"');
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "toString(...)");
        return sb2;
    }
}
