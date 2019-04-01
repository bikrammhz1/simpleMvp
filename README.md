What is MVP?
The MVP pattern allows separating the presentation layer from the logic so that everything 
about how the UI works is agnostic from how we represent it on screen. Ideally, the MVP 
pattern would achieve that the same logic might have completely different and interchangeable views.

The first thing to clarify is that MVP is not an architecture by itself, it’s only responsible 
for the presentation layer. This has been a controversial assessment, so I want to explain it a bit deeper.

You may find that MVP is defined as an architectural pattern because it can become part of the 
architecture of your App, but don’t consider that just because you are using MVP, your architecture is complete. MVP only models the presentation layer, but the rest of layers will still require a good architecture if you want a flexible and scalable App.
