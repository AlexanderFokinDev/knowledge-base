## Apache Superset
[Official documentation](https://superset.apache.org/docs/intro)

#### 1. HandleBars

If you need to display a chart with arbitrary text, you can use type of chart - “Handlebar”. 
Inside it use some mix of Jinja + html + css.

```html
<p style="color:blue;font-size:40px;"><b>
    {{#each data}}
    {{this.Overperformer}}
    {{/each}}
</b></p>
```

![Example HandleBars](superset/handlebars.jpg)