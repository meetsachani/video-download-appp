package o;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;

/* loaded from: classes4.dex */
public final class B8 {
    public static final String d = " -> ";
    public final Map<Integer, String> a;
    public final Map<String, String> b;
    public final int c;

    public B8(Map<Integer, String> map, Map<String, String> map2, int i) {
        this.a = map;
        this.b = map2;
        this.c = i;
    }

    public static /* synthetic */ void a(StringBuilder sb, Integer num, String str) {
        sb.append(c(num.intValue()));
        sb.append(d);
        sb.append(num);
        sb.append(System.lineSeparator());
    }

    public static String c(int i) {
        if (Character.charCount(i) == 1) {
            return String.valueOf((char) i);
        }
        return new String(Character.toChars(i));
    }

    public static Integer[] d(Character[] chArr) {
        if (C4206Se.n1(chArr)) {
            return C4206Se.n;
        }
        Integer[] numArr = new Integer[chArr.length];
        for (int i = 0; i < chArr.length; i++) {
            numArr[i] = Integer.valueOf(chArr[i].charValue());
        }
        return numArr;
    }

    public static B8 e(Integer[] numArr, Integer[] numArr2, Integer[] numArr3) {
        Integer num;
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet(Arrays.asList(numArr));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(Arrays.asList(numArr2));
        LinkedHashSet<Integer> linkedHashSet3 = new LinkedHashSet(Arrays.asList(numArr3));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        HashMap hashMap = new HashMap();
        for (Integer num2 : linkedHashSet3) {
            int intValue = num2.intValue();
            if (linkedHashSet.contains(num2)) {
                if (linkedHashSet2.contains(num2)) {
                    hashMap.put(num2, c(intValue));
                } else {
                    throw new IllegalArgumentException("Can not use 'do not encode' list because encoding alphabet does not contain '" + c(intValue) + "'");
                }
            } else {
                throw new IllegalArgumentException("Can not use 'do not encode' list because original alphabet does not contain '" + c(intValue) + "'");
            }
        }
        if (linkedHashSet2.size() >= linkedHashSet.size()) {
            Iterator it = linkedHashSet2.iterator();
            for (Integer num3 : linkedHashSet) {
                String c = c(num3.intValue());
                if (hashMap.containsKey(num3)) {
                    linkedHashMap.put(num3, c);
                    linkedHashMap2.put(c, c);
                } else {
                    Object next = it.next();
                    while (true) {
                        num = (Integer) next;
                        if (!linkedHashSet3.contains(num)) {
                            break;
                        }
                        next = it.next();
                    }
                    String c2 = c(num.intValue());
                    linkedHashMap.put(num3, c2);
                    linkedHashMap2.put(c2, c);
                }
            }
            return new B8(linkedHashMap, linkedHashMap2, 1);
        } else if (linkedHashSet2.size() - linkedHashSet3.size() >= 2) {
            int size = (linkedHashSet.size() - linkedHashSet3.size()) / (linkedHashSet2.size() - linkedHashSet3.size());
            int i = 1;
            while (size / linkedHashSet2.size() >= 1) {
                size /= linkedHashSet2.size();
                i++;
            }
            int i2 = i + 1;
            B8 b8 = new B8(linkedHashMap, linkedHashMap2, i2);
            b8.b(i2, "", linkedHashSet2, linkedHashSet.iterator(), hashMap);
            return b8;
        } else {
            throw new IllegalArgumentException("Must have at least two encoding characters (excluding those in the 'do not encode' list), but has " + (linkedHashSet2.size() - linkedHashSet3.size()));
        }
    }

    public static B8 f(Character[] chArr, Character[] chArr2, Character[] chArr3) {
        return e(d(chArr), d(chArr2), d(chArr3));
    }

    public static B8 g(Map<Integer, String> map) {
        Map unmodifiableMap = Collections.unmodifiableMap(map);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 1;
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            linkedHashMap.put(entry.getValue(), c(((Integer) entry.getKey()).intValue()));
            if (((String) entry.getValue()).length() > i) {
                i = ((String) entry.getValue()).length();
            }
        }
        return new B8(unmodifiableMap, linkedHashMap, i);
    }

    public final void b(int i, String str, Collection<Integer> collection, Iterator<Integer> it, Map<Integer, String> map) {
        Collection<Integer> collection2;
        Iterator<Integer> it2;
        Map<Integer, String> map2;
        if (i > 0) {
            for (Integer num : collection) {
                int intValue = num.intValue();
                if (!it.hasNext()) {
                    break;
                }
                if (i == this.c && map.containsKey(num)) {
                    collection2 = collection;
                    it2 = it;
                    map2 = map;
                } else {
                    collection2 = collection;
                    it2 = it;
                    map2 = map;
                    b(i - 1, str + c(intValue), collection2, it2, map2);
                }
                collection = collection2;
                it = it2;
                map = map2;
            }
            return;
        }
        Integer next = it.next();
        while (true) {
            Integer num2 = next;
            if (map.containsKey(num2)) {
                String c = c(num2.intValue());
                this.a.put(num2, c);
                this.b.put(c, c);
                if (!it.hasNext()) {
                    return;
                }
                next = it.next();
            } else {
                String c2 = c(num2.intValue());
                this.a.put(num2, str);
                this.b.put(str, c2);
                return;
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B8)) {
            return false;
        }
        B8 b8 = (B8) obj;
        if (!this.a.equals(b8.a) || !this.b.equals(b8.b) || this.c != b8.c) {
            return false;
        }
        return true;
    }

    public String h(String str) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            String c = c(codePointAt);
            if (c.equals(this.a.get(Integer.valueOf(codePointAt)))) {
                sb.append(c);
                i++;
            } else if (this.c + i <= str.length()) {
                String substring = str.substring(i, this.c + i);
                String str2 = this.b.get(substring);
                if (str2 != null) {
                    sb.append(str2);
                    i += this.c;
                } else {
                    throw new UnsupportedEncodingException("Unexpected string without decoding (" + substring + ") in " + str);
                }
            } else {
                throw new UnsupportedEncodingException("Unexpected end of string while decoding " + str);
            }
        }
        return sb.toString();
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
    }

    public String i(String str) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            String str2 = this.a.get(Integer.valueOf(codePointAt));
            if (str2 != null) {
                sb.append(str2);
                i += Character.charCount(codePointAt);
            } else {
                throw new UnsupportedEncodingException("Couldn't find encoding for '" + c(codePointAt) + "' in " + str);
            }
        }
        return sb.toString();
    }

    public int j() {
        return this.c;
    }

    public Map<Integer, String> k() {
        return Collections.unmodifiableMap(this.a);
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        this.a.forEach(new BiConsumer() { // from class: o.A8
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                B8.a(sb, (Integer) obj, (String) obj2);
            }
        });
        return sb.toString();
    }
}
