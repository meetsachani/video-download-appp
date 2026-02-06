package o;

import java.util.Locale;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: o.rt0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9356rt0 {
    public static final int a = 4;
    public static final int b = 14;
    public static final int c = 5;
    public static final int d = 25;
    public static final int e = 5;
    public static final String g = "\n\u000b\f\r\u0085\u2028\u2029";
    public static final String h = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000";
    public static final String i = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    public static final String j = ",*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    public static final String k = "(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";
    public static final String m = ",\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    public static final String n = "(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";

    /* renamed from: o  reason: collision with root package name */
    public static final String f856o = ":,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    public static final String p = "(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)";
    public static final a[] f = {new a(99, 99, -1, -1), new a(35, 36, -1, -1), new a(71, 72, -1, -1), new a(96, 96, -1, -1), new a(85, 86, -1, -1), new a(90, 96, -1, -1), new a(80, 81, -1, -1), new a(6, 6, -1, -1), new a(20, 20, -1, -1), new a(19, 19, -1, -1), new a(32, 34, -1, -1), new a(96, 96, -1, -1), new a(30, 31, -1, -1), new a(96, 96, -1, -1), new a(96, 96, -1, -1), new a(50, 52, -1, -1), new a(83, 83, -1, -1), new a(60, 62, -1, -1), new a(46, 47, -1, -1), new a(66, 67, 73, -1), new a(40, 42, -1, -1), new a(70, 71, -1, -1), new a(1, 2, -1, -1), new a(20, 21, -1, -1), new a(3, 4, -1, -1), new a(96, 96, -1, -1), new a(48, 49, -1, -1), new a(55, 56, -1, -1), new a(63, 65, -1, -1), new a(96, 96, -1, -1), new a(38, 39, -1, -1), new a(55, 56, -1, -1), new a(27, 28, -1, -1), new a(58, 58, -1, -1), new a(68, 69, -1, -1), new a(3, 4, -1, -1), new a(7, 8, -1, -1), new a(87, 88, 86, -1), new a(88, 89, 96, -1), new a(10, 14, 0, 6), new a(43, 45, -1, -1), new a(73, 74, -1, -1), new a(97, 97, -1, -1), new a(15, 19, -1, -1), new a(6, 6, 0, 9), new a(96, 96, -1, -1), new a(2, 2, -1, -1), new a(29, 29, -1, -1), new a(57, 57, -1, -1), new a(37, 38, -1, -1), new a(75, 79, 87, 88), new a(84, 84, -1, -1), new a(22, 24, 20, -1), new a(6, 9, -1, -1), new a(5, 5, -1, -1), new a(98, 99, -1, -1), new a(53, 54, -1, -1), new a(24, 26, -1, -1), new a(82, 83, -1, -1)};
    public static final Pattern l = Pattern.compile("[^,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]+(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
    public static final Pattern q = Pattern.compile("(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
    public static final Pattern r = Pattern.compile("(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+states[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mariana[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(nd|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(ne|nebraska)|(nh|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+hampshire)|(nj|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+jersey)|(nm|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mexico)|(nv|nevada)|(ny|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+rico)|(pw|palau)|(ri|rhode[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+island)|(sc|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(sd|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+virginia)|(wy|wyoming))(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
    public static final Pattern s = Pattern.compile("(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
    public static final Pattern t = Pattern.compile("([0-9]+)(st|nd|rd|th)", 2);
    public static final Pattern u = Pattern.compile("(?:[0-9]{5}(?:-[0-9]{4})?)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* renamed from: o.rt0$a */
    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public int b;
        public int c;
        public int d;

        public a(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public boolean a(String str) {
            int parseInt = Integer.parseInt(str.substring(0, 2));
            if ((this.a > parseInt || parseInt > this.b) && parseInt != this.c && parseInt != this.d) {
                return false;
            }
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        return -r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(String str, MatchResult matchResult) {
        int length;
        MatchResult i2;
        int end = matchResult.end();
        Matcher matcher = l.matcher(str);
        String str2 = "";
        int i3 = -1;
        int i4 = -1;
        int i5 = 1;
        int i6 = 1;
        boolean z = true;
        boolean z2 = false;
        while (true) {
            if (end < str.length()) {
                if (!matcher.find(end)) {
                    length = str.length();
                    break;
                } else if (matcher.end() - matcher.start() > 25) {
                    length = matcher.end();
                    break;
                } else {
                    while (end < matcher.start()) {
                        int i7 = end + 1;
                        if (g.indexOf(str.charAt(end)) != -1) {
                            i5++;
                        }
                        end = i7;
                    }
                    if (i5 > 5 || (i6 = i6 + 1) > 14) {
                        break;
                    }
                    if (h(str, end) != null) {
                        if (z && i5 > 1) {
                            return -end;
                        }
                        if (i3 == -1) {
                            i3 = end;
                        }
                    } else {
                        if (d(matcher.group(0))) {
                            z2 = true;
                        } else if (i6 == 5 && !z2) {
                            end = matcher.end();
                            break;
                        } else if (z2 && i6 > 4 && (i2 = i(str, end)) != null) {
                            if (str2.equals("et") && i2.group(0).equals("al")) {
                                end = i2.end();
                                break;
                            }
                            Matcher matcher2 = l.matcher(str);
                            if (matcher2.find(i2.end())) {
                                if (g(matcher2.group(0), i2)) {
                                    return matcher2.end();
                                }
                            } else {
                                i4 = i2.end();
                            }
                        }
                        z = false;
                    }
                    str2 = matcher.group(0);
                    end = matcher.end();
                }
            } else {
                break;
            }
        }
        if (i4 > 0) {
            return i4;
        }
        if (i3 <= 0) {
            i3 = end;
        }
        return -i3;
    }

    public static boolean b(String str) {
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (Character.isDigit(str.charAt(i3))) {
                i2++;
            }
        }
        if (i2 > 5) {
            return false;
        }
        Matcher matcher = t.matcher(str);
        if (!matcher.find()) {
            return true;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        if (parseInt == 0) {
            return false;
        }
        String lowerCase = matcher.group(2).toLowerCase(Locale.getDefault());
        int i4 = parseInt % 10;
        String str2 = "th";
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    return lowerCase.equals("th");
                }
                if (parseInt % 100 != 13) {
                    str2 = "rd";
                }
                return lowerCase.equals(str2);
            }
            if (parseInt % 100 != 12) {
                str2 = "nd";
            }
            return lowerCase.equals(str2);
        }
        if (parseInt % 100 != 11) {
            str2 = "st";
        }
        return lowerCase.equals(str2);
    }

    public static String c(String str) {
        Matcher matcher = q.matcher(str);
        int i2 = 0;
        while (matcher.find(i2)) {
            if (b(matcher.group(0))) {
                int start = matcher.start();
                int a2 = a(str, matcher);
                if (a2 > 0) {
                    return str.substring(start, a2);
                }
                i2 = -a2;
            } else {
                i2 = matcher.end();
            }
        }
        return null;
    }

    public static boolean d(String str) {
        return s.matcher(str).matches();
    }

    public static boolean e(String str) {
        return u.matcher(str).matches();
    }

    public static boolean f(String str, String str2) {
        return g(str, i(str2, 0));
    }

    public static boolean g(String str, MatchResult matchResult) {
        if (matchResult == null) {
            return false;
        }
        int groupCount = matchResult.groupCount();
        while (true) {
            if (groupCount <= 0) {
                break;
            }
            int i2 = groupCount - 1;
            if (matchResult.group(groupCount) != null) {
                groupCount = i2;
                break;
            }
            groupCount = i2;
        }
        if (!u.matcher(str).matches() || !f[groupCount].a(str)) {
            return false;
        }
        return true;
    }

    public static MatchResult h(String str, int i2) {
        if (i2 > 0 && f856o.indexOf(str.charAt(i2 - 1)) == -1) {
            return null;
        }
        Matcher region = q.matcher(str).region(i2, str.length());
        if (region.lookingAt()) {
            MatchResult matchResult = region.toMatchResult();
            if (b(matchResult.group(0))) {
                return matchResult;
            }
        }
        return null;
    }

    public static MatchResult i(String str, int i2) {
        if (i2 > 0 && j.indexOf(str.charAt(i2 - 1)) == -1) {
            return null;
        }
        Matcher region = r.matcher(str).region(i2, str.length());
        if (!region.lookingAt()) {
            return null;
        }
        return region.toMatchResult();
    }
}
