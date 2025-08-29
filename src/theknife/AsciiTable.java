//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package theknife;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AsciiTable {
    public AsciiTable() {
    }

    public static String render(List<String> headers, List<List<String>> rows) {
        List<Integer> widths = new ArrayList();

        for(int i = 0; i < headers.size(); ++i) {
            int w = ((String)headers.get(i)).length();
            Iterator var5 = rows.iterator();

            while(var5.hasNext()) {
                List<String> row = (List)var5.next();
                if (i < row.size()) {
                    w = Math.max(w, row.get(i) == null ? 0 : ((String)row.get(i)).length());
                }
            }

            widths.add(w);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(line(widths)).append("\n");
        sb.append(row(widths, headers)).append("\n");
        sb.append(line(widths)).append("\n");
        Iterator var8 = rows.iterator();

        while(var8.hasNext()) {
            List<String> r = (List)var8.next();
            sb.append(row(widths, r)).append("\n");
        }

        sb.append(line(widths));
        return sb.toString();
    }

    private static String line(List<Integer> widths) {
        StringBuilder sb = new StringBuilder("+");
        Iterator var2 = widths.iterator();

        while(var2.hasNext()) {
            int w = (Integer)var2.next();
            sb.append("-".repeat(w + 2)).append("+");
        }

        return sb.toString();
    }

    private static String row(List<Integer> widths, List<String> cells) {
        StringBuilder sb = new StringBuilder("|");

        for(int i = 0; i < widths.size(); ++i) {
            String c = i < cells.size() ? (cells.get(i) == null ? "" : (String)cells.get(i)) : "";
            sb.append(" ").append(pad(c, (Integer)widths.get(i))).append(" |");
        }

        return sb.toString();
    }

    private static String pad(String s, int w) {
        return s.length() >= w ? s : s + " ".repeat(w - s.length());
    }
}
